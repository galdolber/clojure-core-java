package clojure;

import clojure.lang.*;

public final class core_parents extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "parents");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "global-hierarchy");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "not-empty");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "parents");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "class?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "into1");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "set");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "bases");
 }
 public core_parents() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object h1, java.lang.Object tag2) {
  Object __r3062 = null;
  {
   Object tp3 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)RT.get(h1, Keyword.intern(null, "parents"))), ((java.lang.Object)tag2)));
   Object __r3063;
   Object __r3064 = ((IFn)const__5.getRawRoot()).invoke(tag2);
   if (__r3064 != null && !(__r3064 == Boolean.FALSE)) {
    __r3063 = ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(tag2)), tp3);
   } else {
    __r3063 = tp3;
   }
   __r3062 = __r3063;
  }
  return ((IFn)const__2.getRawRoot()).invoke(__r3062);
 }
 public java.lang.Object invoke(java.lang.Object tag1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), tag1);
 }
}
