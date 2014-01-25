package clojure;

import clojure.lang.*;

public final class core_pmap extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__1 = (java.lang.Object)2L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "drop");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "pmap");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "cons");
 }
 public core_pmap() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object f1, java.lang.Object coll2, java.lang.Object colls3) {
  {
   Object step4 = new clojure.core_pmap_step__6345();
   return ((IFn)const__4.getRawRoot()).invoke(new clojure.core_pmap_fn__6349(f1), ((IFn)step4).invoke(((IFn)const__5.getRawRoot()).invoke(coll2, colls3)));
  }
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object coll2) {
  {
   long n3 = clojure.lang.Numbers.add((long)2L, (long)((java.lang.Runtime)((java.lang.Runtime)java.lang.Runtime.getRuntime())).availableProcessors());
   Object rets4 = ((IFn)const__2.getRawRoot()).invoke(new clojure.core_pmap_fn__6334(f1), coll2);
   Object step5 = new clojure.core_pmap_step__6339();
   return ((IFn)step5).invoke(rets4, ((IFn)const__3.getRawRoot()).invoke(Numbers.num(n3), rets4));
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
