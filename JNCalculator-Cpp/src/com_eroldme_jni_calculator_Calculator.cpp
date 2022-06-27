#include "com_eroldme_jni_calculator_Calculator.h"

jdouble JNICALL Java_com_eroldme_jni_calculator_Calculator_add
(JNIEnv* env, jobject object, jdouble first, jdouble second) {
	return first + second;
}

jdouble JNICALL Java_com_eroldme_jni_calculator_Calculator_subtract
(JNIEnv* env, jobject object, jdouble first, jdouble second) {
	return first - second;
}

jdouble JNICALL Java_com_eroldme_jni_calculator_Calculator_divide
(JNIEnv* env, jobject object, jdouble first, jdouble second) {
	return first / second;
}

jdouble JNICALL Java_com_eroldme_jni_calculator_Calculator_multiply
(JNIEnv* env, jobject object, jdouble first, jdouble second) {
	return first * second;
}