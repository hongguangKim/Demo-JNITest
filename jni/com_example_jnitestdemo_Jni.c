#include<stdio.h>
#include<stdlib.h>
#include"com_example_jnitestdemo_Jni.h"
int add() {
	int x, y;
	x = 100;
	y = 100;
	return x * 100;
}
JNIEXPORT jint JNICALL Java_com_example_jnitestdemo_Jni_add(JNIEnv *env,
		jobject thiz) {
	return add();
}

//JNIEnv *env 是jni内部函数指针
JNIEXPORT jstring JNICALL Java_com_example_jnitestdemo_Jni_getString(
		JNIEnv *env, jobject thiz) {
	(*env)->NewStringUTF(env, "hello world in c!!!");
}
