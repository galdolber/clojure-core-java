package clojure;

import clojure.lang.*;

public final class core_ancestors extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "ancestors");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "global-hierarchy");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "not-empty");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "ancestors");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "class?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "set");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "supers");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "into1");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 public core_ancestors() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object h1, java.lang.Object tag2) {
  Object __r3065 = null;
  {
   Object ta3 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)RT.get(h1, Keyword.intern(null, "ancestors"))), ((java.lang.Object)tag2)));
   Object __r3066;
   Object __r3067 = ((IFn)const__5.getRawRoot()).invoke(tag2);
   if (__r3067 != null && !(__r3067 == Boolean.FALSE)) {
    Object __r3068 = null;
    {
     Object superclasses4 = ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(tag2));
     __r3068 = ((IFn)const__8.getRawRoot()).invoke(const__9.getRawRoot(), superclasses4, ((IFn)const__10.getRawRoot()).invoke(ta3, ((IFn)const__11.getRawRoot()).invoke(new clojure.core_ancestors_fn__4900(h1), superclasses4)));
    }
    __r3066 = __r3068;
   } else {
    __r3066 = ta3;
   }
   __r3065 = __r3066;
  }
  return ((IFn)const__2.getRawRoot()).invoke(__r3065);
 }
 public java.lang.Object invoke(java.lang.Object tag1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), tag1);
 }
}
