package clojure;

import clojure.lang.*;

public final class core_partition_fn__4335 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "doall");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "take");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "partition");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "nthrest");
 }
 Object coll3;
 Object n1;
 Object step2;
 public core_partition_fn__4335(final Object coll3, final Object n1, final Object step2) {
  super();
  this.coll3 = coll3;
  this.n1 = n1;
  this.step2 = step2;
 }
 public java.lang.Object invoke() {
  {
   Object temp__4117__auto__1 = ((IFn)const__0.getRawRoot()).invoke(this.coll3);
   Object __r2577 = temp__4117__auto__1;
   if (__r2577 != null && !(__r2577 == Boolean.FALSE)) {
    {
     Object s2 = temp__4117__auto__1;
     {
      Object p3 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this.n1, s2));
      if (clojure.lang.Util.equiv(((java.lang.Object)this.n1), (long)clojure.lang.RT.count(((java.lang.Object)p3)))) {
       return ((IFn)const__5.getRawRoot()).invoke(p3, ((IFn)const__6.getRawRoot()).invoke(this.n1, this.step2, ((IFn)const__7.getRawRoot()).invoke(s2, this.step2)));
      } else {
       return null;
      }
     }
    }
   } else {
    return null;
   }
  }
 }
}
