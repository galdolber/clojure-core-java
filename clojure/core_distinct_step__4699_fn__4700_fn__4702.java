package clojure;

import clojure.lang.*;

public final class core_distinct_step__4699_fn__4700_fn__4702 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 Object step0;
 public core_distinct_step__4699_fn__4700_fn__4702(final Object step0) {
  super();
  this.step0 = step0;
 }
 public java.lang.Object invoke(java.lang.Object p__47011, java.lang.Object seen2) {
  while(true) {
   {
    Object vec__47033 = p__47011;
    Object f4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__47033), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object xs5 = vec__47033;
    {
     Object temp__4117__auto__6 = ((IFn)const__2.getRawRoot()).invoke(xs5);
     Object __r2909 = temp__4117__auto__6;
     if (__r2909 != null && !(__r2909 == Boolean.FALSE)) {
      {
       Object s7 = temp__4117__auto__6;
       Object __r2911 = ((IFn)const__3.getRawRoot()).invoke(seen2, f4);
       if (__r2911 != null && !(__r2911 == Boolean.FALSE)) {
        java.lang.Object p__47011___aux = ((IFn)const__4.getRawRoot()).invoke(s7);
        p__47011 = p__47011___aux;
        continue;
       } else {
        return ((IFn)const__5.getRawRoot()).invoke(f4, ((IFn)this.step0).invoke(((IFn)const__4.getRawRoot()).invoke(s7), ((IFn)const__6.getRawRoot()).invoke(seen2, f4)));
       }
      }
     } else {
      return null;
     }
    }
   }
  }
 }
}
