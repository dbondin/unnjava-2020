#include <stdio.h>

#include "sample19_A.h"

JNIEXPORT void JNICALL Java_sample19_A_fn2(JNIEnv * env, jobject jobj) {
  printf("A from C native code\n");
}
