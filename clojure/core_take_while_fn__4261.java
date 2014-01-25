package clojure;

import clojure.lang.*;

public final class core_take_while_fn__4261 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "take-while");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object pred1;
 Object coll2;
 public core_take_while_fn__4261(final Object pred1, final Object coll2) {
  super();
  this.pred1 = pred1;
  this.coll2 = coll2;
 }
 public java.lang.Object invoke() {
  {
   Object temp__4117__auto__1 = ((IFn)const__0.getRawRoot()).invoke(this.coll2);
   Object __r2506 = temp__4117__auto__1;
   if (__r2506 != null && !(__r2506 == Boolean.FALSE)) {
    {
     Object s2 = temp__4117__auto__1;
     Object __r2508 = ((IFn)this.pred1).invoke(((IFn)const__1.getRawRoot()).invoke(s2));
     if (__r2508 != null && !(__r2508 == Boolean.FALSE)) {
      return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(s2), ((IFn)const__3.getRawRoot()).invoke(this.pred1, ((IFn)const__4.getRawRoot()).invoke(s2)));
     } else {
      return null;
     }
    }
   } else {
    return null;
   }
  }
 }
}
