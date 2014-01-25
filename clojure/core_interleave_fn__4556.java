package clojure;

import clojure.lang.*;

public final class core_interleave_fn__4556 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "every?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "identity");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "interleave");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object c11;
 Object colls3;
 Object c22;
 public core_interleave_fn__4556(final Object c11, final Object colls3, final Object c22) {
  super();
  this.c11 = c11;
  this.colls3 = colls3;
  this.c22 = c22;
 }
 public java.lang.Object invoke() {
  {
   Object ss1 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(this.colls3, this.c22, this.c11));
   Object __r2781 = ((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), ss1);
   if (__r2781 != null && !(__r2781 == Boolean.FALSE)) {
    return ((IFn)const__5.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(const__6.getRawRoot(), ss1), ((IFn)const__7.getRawRoot()).invoke(const__8.getRawRoot(), ((IFn)const__0.getRawRoot()).invoke(const__9.getRawRoot(), ss1)));
   } else {
    return null;
   }
  }
 }
}
