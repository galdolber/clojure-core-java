package clojure;

import clojure.lang.*;

public final class core_take_fn__4257 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "take");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object coll2;
 Object n1;
 public core_take_fn__4257(final Object coll2, final Object n1) {
  super();
  this.coll2 = coll2;
  this.n1 = n1;
 }
 public java.lang.Object invoke() {
  if (clojure.lang.Numbers.isPos(((java.lang.Object)this.n1))) {
   {
    Object temp__4117__auto__1 = ((IFn)const__1.getRawRoot()).invoke(this.coll2);
    Object __r2504 = temp__4117__auto__1;
    if (__r2504 != null && !(__r2504 == Boolean.FALSE)) {
     {
      Object s2 = temp__4117__auto__1;
      return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(s2), ((IFn)const__4.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)this.n1))), ((IFn)const__6.getRawRoot()).invoke(s2)));
     }
    } else {
     return null;
    }
   }
  } else {
   return null;
  }
 }
}
