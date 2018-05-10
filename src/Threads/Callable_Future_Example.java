package Threads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class callableTask implements Callable<List<Resources>>{
	int noOfThread;
	public callableTask(int noOfThread) {
		this.noOfThread = noOfThread;
	}
	@Override
	public List<Resources> call() throws Exception {
		List<Resources> resourcesList = new ArrayList<Resources>();
		for(int i=0;i<noOfThread;i++)
		{ 
			Resources resources = new Resources();
			resources.setName(i+"#A#"+ new Random().hashCode());
			resourcesList.add(resources);
		}
		return resourcesList;
	}
}
class ProcessTask{
	  int noOfThread=2;
	  ExecutorService executorService = Executors.newFixedThreadPool(noOfThread);
	  List<Object> futureList = new ArrayList<Object>();
	  List<Resources> resultList = new ArrayList<Resources>();
	  public List<Resources> returnData(){
    	  for(int i=0;i<noOfThread;i++)
    	  {
    		  Callable<List<Resources>> callable = new callableTask(noOfThread);
    		  Future<List<Resources>> future = executorService.submit(callable);
    		  futureList.add(future);
    	  }
    	  for(Object obj : futureList){
    		 try {
    			 List<Resources>  res = (List<Resources>)(((Future<List<Resources>>) obj).get());
    			 resultList.addAll( res); 
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	  }
    	 return resultList; 
      }
}
public class Callable_Future_Example {
	public static void main(String[] args) {
		ProcessTask task = new ProcessTask();
		List<Resources> resources =  task.returnData();
		for(Resources res : resources){
			System.out.println(res.getName());
		}
	}
}
class Resources implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}