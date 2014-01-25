package clojure;

import clojure.lang.*;

public final class main_repl_opt extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "some");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "clojure-version");
  const__7 = (clojure.lang.Var)RT.var("clojure.main", "repl");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "init");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "prn");
 }
 public main_repl_opt() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__68251, java.lang.Object inits2) {
  {
   Object vec__68263 = p__68251;
   Object _4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68263), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object args5 = ((IFn)const__2.getRawRoot()).invoke(vec__68263, const__3);
   Object __r4481 = ((IFn)const__4.getRawRoot()).invoke(new clojure.main_repl_opt_fn__6827(), inits2);
   if (__r4481 != null && !(__r4481 == Boolean.FALSE)) {
   } else {
    ((IFn)const__5.getRawRoot()).invoke("Clojure", ((IFn)const__6.getRawRoot()).invoke());
   }
   ((IFn)const__7.getRawRoot()).invoke(const__8, new clojure.main_repl_opt_fn__6829(args5, inits2));
   ((IFn)const__9.getRawRoot()).invoke();
   java.lang.System.exit((int)RT.intCast(0L));
   return null;
  }
 }
}
