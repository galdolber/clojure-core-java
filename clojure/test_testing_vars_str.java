package clojure;

import clojure.lang.*;

public final class test_testing_vars_str extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "reverse");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__8 = (clojure.lang.Var)RT.var("clojure.test", "*testing-vars*");
 }
 public test_testing_vars_str() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  {
   Object map__70862 = m1;
   Object __r4661;
   Object __r4662 = ((IFn)const__0.getRawRoot()).invoke(map__70862);
   if (__r4662 != null && !(__r4662 == Boolean.FALSE)) {
    __r4661 = ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__1.getRawRoot()).invoke(map__70862))));
   } else {
    __r4661 = map__70862;
   }
   Object map__70863 = __r4661;
   Object line4 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70863), ((java.lang.Object)const__3)));
   Object file5 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70863), ((java.lang.Object)const__4)));
   return ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(new clojure.test_testing_vars_str_fn__7087(), const__8.get())), " (", file5, ":", line4, ")");
  }
 }
}
