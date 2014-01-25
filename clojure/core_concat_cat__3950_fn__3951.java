package clojure;

import clojure.lang.*;

public final class core_concat_cat__3950_fn__3951 extends clojure.lang.AFunction {
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
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 Object cat0;
 Object xys1;
 Object zs2;
 public core_concat_cat__3950_fn__3951(final Object cat0, final Object xys1, final Object zs2) {
  super();
  this.cat0 = cat0;
  this.xys1 = xys1;
  this.zs2 = zs2;
 }
 public java.lang.Object invoke() {
  {
   Object xys1 = ((IFn)const__0.getRawRoot()).invoke(this.xys1);
   Object __r2328 = xys1;
   if (__r2328 != null && !(__r2328 == Boolean.FALSE)) {
    Object __r2330 = ((IFn)const__1.getRawRoot()).invoke(xys1);
    if (__r2330 != null && !(__r2330 == Boolean.FALSE)) {
     return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(xys1), ((IFn)this.cat0).invoke(((IFn)const__4.getRawRoot()).invoke(xys1), this.zs2));
    } else {
     return ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(xys1), ((IFn)this.cat0).invoke(((IFn)const__7.getRawRoot()).invoke(xys1), this.zs2));
    }
   } else {
    Object __r2332 = this.zs2;
    if (__r2332 != null && !(__r2332 == Boolean.FALSE)) {
     return ((IFn)this.cat0).invoke(((IFn)const__6.getRawRoot()).invoke(this.zs2), ((IFn)const__8.getRawRoot()).invoke(this.zs2));
    } else {
     return null;
    }
   }
  }
 }
}
