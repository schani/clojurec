LOCAL_PATH := $(call my-dir)
GLIB_PATH := /opt/local/include/glib-2.0 /opt/local/lib/glib-2.0/include

include $(CLEAR_VARS)

CLJC_SRC := ../../../src/c
LOCAL_CFLAGS := -DMAIN_FUNCTION_NAME=main_android
LOCAL_C_INCLUDES := libgc.android/include $(GLIB_PATH) ../thirdparty/klib
LOCAL_MODULE    := clojurec 
LOCAL_SRC_FILES := main.c $(CLJC_SRC)/support_android.c ../../cljc.c
LOCAL_LDLIBS    := -llog -landroid libgc.android/lib/libgc.a
LOCAL_STATIC_LIBRARIES := android_native_app_glue

include $(BUILD_SHARED_LIBRARY)

$(call import-module,android/native_app_glue)

