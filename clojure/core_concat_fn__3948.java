package clojure;

import clojure.lang.*;

public final class core_concat_fn__3948 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "chunk-cons");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object x1;
 Object y2;
 public core_concat_fn__3948(final Object x1, final Object y2) {
  super();
  this.x1 = x1;
  this.y2 = y2;
 }
 public java.lang.Object invoke() {
  {
   Object s1 = ((IFn)const__0.getRawRoot()).invoke(this.x1);
   Object __r2324 = s1;
   if (__r2324 != null && !(__r2324 == Boolean.FALSE)) {
    Object __r2326 = ((IFn)const__1.getRawRoot()).invoke(s1);
    if (__r2326 != null && !(__r2326 == Boolean.FALSE)) {
     return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(s1), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(s1), this.y2));
    } else {
     return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(s1), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(s1), this.y2));
    }
   } else {
    return this.y2;
   }
  }
 }
}
