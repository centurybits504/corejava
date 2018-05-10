package Newfeatures;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/*java 6 Newfeatures : Scripting Language Support */
public class Java6Features_ScriptingLanguageSupport_Example {
	
	public static void main(String[] args) throws Exception {
		// create a script engine manager
		ScriptEngineManager factory = new ScriptEngineManager();
		// create a JavaScript engine
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		// evaluate JavaScript code from String
		engine.eval("print('Hello, World')");
	}
}
