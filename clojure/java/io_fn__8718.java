package clojure.java;

import clojure.lang.*;

public final class io_fn__8718 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "make-array");
  const__1 = (clojure.lang.Var)RT.var("clojure.java.io", "buffer-size");
  const__2 = (clojure.lang.Var)RT.var("clojure.java.io", "encoding");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__4 = (java.lang.Object)0L;
 }
 public io_fn__8718() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object input1, java.lang.Object output2, java.lang.Object opts3) {
  try {
   {
    Object buffer4 = ((IFn)const__0.getRawRoot()).invoke(((java.lang.Class)java.lang.Character.TYPE), ((IFn)const__1.getRawRoot()).invoke(opts3));
    Object out5 = new java.io.OutputStreamWriter((java.io.OutputStream)((java.io.OutputStream)output2), (java.lang.String)((java.lang.String)((IFn)const__2.getRawRoot()).invoke(opts3)));
    {
     while(true) {
      {
       int size6 = ((java.io.Reader)input1).read((char[])((char[])buffer4));
       if (clojure.lang.Numbers.isPos((long)size6)) {
        ((java.io.OutputStreamWriter)out5).write((char[])((char[])buffer4), (int)RT.intCast(0L), (int)size6);
        continue;
       } else {
        ((java.io.OutputStreamWriter)out5).flush();
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
