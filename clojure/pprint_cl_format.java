package clojure;

import clojure.lang.*;

public final class pprint_cl_format extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "compile-format");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "init-navigator");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-format");
 }
 public pprint_cl_format() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object writer1, java.lang.Object format_in2, java.lang.Object args3) {
  {
   Object __r5049;
   Object __r5050 = ((IFn)const__0.getRawRoot()).invoke(format_in2);
   if (__r5050 != null && !(__r5050 == Boolean.FALSE)) {
    __r5049 = ((IFn)const__1.getRawRoot()).invoke(format_in2);
   } else {
    __r5049 = format_in2;
   }
   Object compiled_format4 = __r5049;
   Object navigator5 = ((IFn)const__2.getRawRoot()).invoke(args3);
   return ((IFn)const__3.getRawRoot()).invoke(writer1, compiled_format4, navigator5);
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
