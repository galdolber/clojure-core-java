package clojure.java;

import clojure.lang.*;

public final class io_fn__8716 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "do-copy");
 }
 public io_fn__8716() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object input1, java.lang.Object output2, java.lang.Object opts3) {
  try {
   {
    Object out4 = new java.io.FileOutputStream((java.io.File)((java.io.File)output2));
    try {
     return ((IFn)const__0.getRawRoot()).invoke(input1, out4, opts3);
    } finally {
     ((java.io.FileOutputStream)out4).close();
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
