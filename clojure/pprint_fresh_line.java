package clojure;

import clojure.lang.*;

public final class pprint_fresh_line extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.IDeref.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__5 = (java.lang.Object)0L;
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "get-column");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "prn");
 }
 public pprint_fresh_line() {
  super();
 }
 public java.lang.Object invoke() {
  if ((const__2.get() instanceof clojure.lang.IDeref)) {
   Object __r5622 = ((IFn)const__3.getRawRoot()).invoke((clojure.lang.Util.equiv((long)0L, ((java.lang.Object)((IFn)const__6.getRawRoot()).invoke(RT.get(((IFn)const__8.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__2.get())), Keyword.intern(null, "base"))))) ? Boolean.TRUE : Boolean.FALSE));
   if (__r5622 != null && !(__r5622 == Boolean.FALSE)) {
    return ((IFn)const__9.getRawRoot()).invoke();
   } else {
    return null;
   }
  } else {
   return ((IFn)const__9.getRawRoot()).invoke();
  }
 }
}
