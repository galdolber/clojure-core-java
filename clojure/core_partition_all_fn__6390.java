package clojure;

import clojure.lang.*;

public final class core_partition_all_fn__6390 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "doall");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "take");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "partition-all");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nthrest");
 }
 Object step2;
 Object coll3;
 Object n1;
 public core_partition_all_fn__6390(final Object step2, final Object coll3, final Object n1) {
  super();
  this.step2 = step2;
  this.coll3 = coll3;
  this.n1 = n1;
 }
 public java.lang.Object invoke() {
  {
   Object temp__4117__auto__1 = ((IFn)const__0.getRawRoot()).invoke(this.coll3);
   Object __r4116 = temp__4117__auto__1;
   if (__r4116 != null && !(__r4116 == Boolean.FALSE)) {
    {
     Object s2 = temp__4117__auto__1;
     {
      Object seg3 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this.n1, s2));
      return ((IFn)const__3.getRawRoot()).invoke(seg3, ((IFn)const__4.getRawRoot()).invoke(this.n1, this.step2, ((IFn)const__5.getRawRoot()).invoke(s2, this.step2)));
     }
    }
   } else {
    return null;
   }
  }
 }
}
