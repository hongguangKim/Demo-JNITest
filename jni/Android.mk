LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := NewJNI
LOCAL_SRC_FILES := com_example_jnitestdemo_Jni.c

include $(BUILD_SHARED_LIBRARY)
