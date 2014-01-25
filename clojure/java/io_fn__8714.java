package clojure.java;

import clojure.lang.*;

public final class io_fn__8714 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "make-array");
  const__1 = (clojure.lang.Var)RT.var("clojure.java.io", "buffer-size");
  const__2 = (clojure.lang.Var)RT.var("clojure.java.io", "encoding");
  const__3 = (java.lang.Object)0L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "alength");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
 }
 public io_fn__8714() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object input1, java.lang.Object output2, java.lang.Object opts3) {
  try {
   {
    Object buffer4 = ((IFn)const__0.getRawRoot()).invoke(((java.lang.Class)java.lang.Character.TYPE), ((IFn)const__1.getRawRoot()).invoke(opts3));
    Object in5 = new java.io.InputStreamReader((java.io.InputStream)((java.io.InputStream)input1), (java.lang.String)((java.lang.String)((IFn)const__2.getRawRoot()).invoke(opts3)));
    {
     while(true) {
      {
       int size6 = ((java.io.InputStreamReader)in5).read((char[])((char[])buffer4), (int)RT.intCast(0L), (int)clojure.lang.RT.alength((char[])((char[])buffer4)));
       if (clojure.lang.Numbers.isPos((long)size6)) {
        ((java.io.Writer)output2).write((char[])((char[])buffer4), (int)RT.intCast(0L), (int)size6);
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
