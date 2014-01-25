package clojure.core;

import clojure.lang.*;

public final class reducers_compile_if_fn__6626 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "eval");
 }
 Object exp3;
 public reducers_compile_if_fn__6626(final Object exp3) {
  super();
  this.exp3 = exp3;
 }
 public java.lang.Object invoke() {
  try {
   return ((IFn)const__0.getRawRoot()).invoke(this.exp3);
  }
  catch (Throwable ex___) {
   if (ex___ instanceof java.lang.Throwable) {
    java.lang.Throwable _3 = (java.lang.Throwable) ex___;
    return Boolean.FALSE;
   }
   else {
    throw Util.sneakyThrow(ex___);
   }
  }
 }
}
