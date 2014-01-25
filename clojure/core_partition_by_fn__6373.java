package clojure;

import clojure.lang.*;

public final class core_partition_by_fn__6373 extends clojure.lang.AFunction {
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
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "take-while");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "partition-by");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "drop");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "count");
 }
 Object coll2;
 Object f1;
 public core_partition_by_fn__6373(final Object coll2, final Object f1) {
  super();
  this.coll2 = coll2;
  this.f1 = f1;
 }
 public java.lang.Object invoke() {
  {
   Object temp__4117__auto__1 = ((IFn)const__0.getRawRoot()).invoke(this.coll2);
   Object __r4110 = temp__4117__auto__1;
   if (__r4110 != null && !(__r4110 == Boolean.FALSE)) {
    {
     Object s2 = temp__4117__auto__1;
     {
      Object fst3 = ((IFn)const__1.getRawRoot()).invoke(s2);
      Object fv4 = ((IFn)this.f1).invoke(fst3);
      Object run5 = ((IFn)const__2.getRawRoot()).invoke(fst3, ((IFn)const__3.getRawRoot()).invoke(new clojure.core_partition_by_fn__6373_fn__6374(fv4, this.f1), ((IFn)const__4.getRawRoot()).invoke(s2)));
      return ((IFn)const__2.getRawRoot()).invoke(run5, ((IFn)const__5.getRawRoot()).invoke(this.f1, ((IFn)const__0.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)run5))), s2))));
     }
    }
   } else {
    return null;
   }
  }
 }
}
