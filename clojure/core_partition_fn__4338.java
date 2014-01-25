package clojure;

import clojure.lang.*;

public final class core_partition_fn__4338 extends clojure.lang.AFunction {
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
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "doall");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "take");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "partition");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "nthrest");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "concat");
 }
 Object pad3;
 Object n1;
 Object step2;
 Object coll4;
 public core_partition_fn__4338(final Object pad3, final Object n1, final Object step2, final Object coll4) {
  super();
  this.pad3 = pad3;
  this.n1 = n1;
  this.step2 = step2;
  this.coll4 = coll4;
 }
 public java.lang.Object invoke() {
  {
   Object temp__4117__auto__1 = ((IFn)const__0.getRawRoot()).invoke(this.coll4);
   Object __r2580 = temp__4117__auto__1;
   if (__r2580 != null && !(__r2580 == Boolean.FALSE)) {
    {
     Object s2 = temp__4117__auto__1;
     {
      Object p3 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this.n1, s2));
      if (clojure.lang.Util.equiv(((java.lang.Object)this.n1), (long)clojure.lang.RT.count(((java.lang.Object)p3)))) {
       return ((IFn)const__5.getRawRoot()).invoke(p3, ((IFn)const__6.getRawRoot()).invoke(this.n1, this.step2, this.pad3, ((IFn)const__7.getRawRoot()).invoke(s2, this.step2)));
      } else {
       return ((IFn)const__8.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this.n1, ((IFn)const__9.getRawRoot()).invoke(p3, this.pad3)));
      }
     }
    }
   } else {
    return null;
   }
  }
 }
}
