package clojure;

import clojure.lang.*;

public final class pprint_pprint_map_fn__8242_fn__8244 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "start-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "ffirst");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-newline");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "linear");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-length*");
  const__7 = (java.lang.Object)0L;
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "fnext");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__10 = (clojure.lang.Var)RT.var("clojure.pprint", "end-block");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object aseq4;
 public pprint_pprint_map_fn__8242_fn__8244(final Object aseq4) {
  super();
  this.aseq4 = aseq4;
 }
 public java.lang.Object invoke() {
  try {
   try {
    ((IFn)const__0).invoke(const__1.get(), null, null, null);
    ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.aseq4));
    ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)" "));
    ((IFn)const__4.getRawRoot()).invoke(const__5);
    const__6.set(const__7);
    ((IFn)const__2.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(this.aseq4)));
    return ((IFn)const__10).invoke(const__1.get());
   } finally {
    ((IFn)const__11.getRawRoot()).invoke();
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
