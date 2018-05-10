package Keywords;

/*	NativeKeywordExample.java	*/
public class NativeKeywordExample {
	/*	here add is the native method, whose implementation is written using c language */
	public native int add(int i);
	public static void main(String[] args) {
		  System.loadLibrary("NativeKeywordExample");
	        System.out.println(new NativeKeywordExample().add(2));

	}

}

/*	NativeKeywordExample.c		*/
/*	Native library	written in c language	*/
#include <jni.h>
#include "NativeKeywordExample.h"
JNIEXPORT jint JNICALL Java_NativeKeywordExample_add(
    JNIEnv *env, jobject obj, jint i) {
  return i + i;
}

