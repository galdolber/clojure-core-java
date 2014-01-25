package clojure.java;

import clojure.lang.*;

public final class io_fn__8712 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "make-array");
  const__1 = (clojure.lang.Var)RT.var("clojure.java.io", "buffer-size");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__3 = (java.lang.Object)0L;
 }
 public io_fn__8712() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object input1, java.lang.Object output2, java.lang.Object opts3) {
  try {
   {
    Object buffer4 = ((IFn)const__0.getRawRoot()).invoke(((java.lang.Class)java.lang.Byte.TYPE), ((IFn)const__1.getRawRoot()).invoke(opts3));
    {
     while(true) {
      {
       int size5 = ((java.io.InputStream)input1).read((byte[])((byte[])buffer4));
       if (clojure.lang.Numbers.isPos((long)size5)) {
        ((java.io.OutputStream)output2).write((byte[])((byte[])buffer4), (int)RT.intCast(0L), (int)size5);
        continue;
       } else {
        return null;
       }
      }
     }
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
