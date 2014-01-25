package clojure.core;

import clojure.lang.*;

public final class reducers_foldvec extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "<=");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__3 = (clojure.lang.Var)RT.var("clojure.core.reducers", "reduce");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "quot");
  const__6 = (java.lang.Object)2L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "subvec");
  const__8 = (java.lang.Object)0L;
  const__9 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fjinvoke");
 }
 public reducers_foldvec() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object v1, java.lang.Object n2, java.lang.Object combinef3, java.lang.Object reducef4) {
  Object __r4418 = ((IFn)const__0.getRawRoot()).invoke(v1);
  if (__r4418 != null && !(__r4418 == Boolean.FALSE)) {
   return ((IFn)combinef3).invoke();
  } else {
   if (clojure.lang.Numbers.lte((long)clojure.lang.RT.count(((java.lang.Object)v1)), ((java.lang.Object)n2))) {
    return ((IFn)const__3.getRawRoot()).invoke(reducef4, ((IFn)combinef3).invoke(), v1);
   } else {
    Object __r4421 = const__4;
    if (__r4421 != null && !(__r4421 == Boolean.FALSE)) {
     {
      long split5 = clojure.lang.Numbers.quotient((long)clojure.lang.RT.count(((java.lang.Object)v1)), (long)2L);
      Object v16 = ((IFn)const__7.getRawRoot()).invoke(v1, const__8, Numbers.num(split5));
      Object v27 = ((IFn)const__7.getRawRoot()).invoke(v1, Numbers.num(split5), Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)v1))));
      Object fc8 = new clojure.core.reducers_foldvec_fc__6749(n2, combinef3, reducef4);
      return ((IFn)const__9.getRawRoot()).invoke(new clojure.core.reducers_foldvec_fn__6753(v16, fc8, combinef3, v27));
     }
    } else {
     return null;
    }
   }
  }
 }
}
