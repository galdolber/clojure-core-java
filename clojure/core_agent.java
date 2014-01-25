package clojure;

import clojure.lang.*;

public final class core_agent extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Keyword const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "setup-reference");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "error-handler");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "error-mode");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "continue");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "fail");
 }
 public core_agent() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object state1, java.lang.Object options2) {
  {
   Object a3 = new clojure.lang.Agent(((java.lang.Object)state1));
   Object opts4 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), options2);
   ((IFn)const__2.getRawRoot()).invoke(a3, options2);
   Object __r2434 = RT.get(opts4, Keyword.intern(null, "error-handler"));
   if (__r2434 != null && !(__r2434 == Boolean.FALSE)) {
    ((clojure.lang.Agent)a3).setErrorHandler((clojure.lang.IFn)((clojure.lang.IFn)RT.get(opts4, Keyword.intern(null, "error-handler"))));
   } else {
   }
   Object __r2435 = null;
   {
    Object or__3968__auto__5 = RT.get(opts4, Keyword.intern(null, "error-mode"));
    Object __r2436;
    Object __r2437 = or__3968__auto__5;
    if (__r2437 != null && !(__r2437 == Boolean.FALSE)) {
     __r2436 = or__3968__auto__5;
    } else {
     Object __r2438;
     Object __r2439 = RT.get(opts4, Keyword.intern(null, "error-handler"));
     if (__r2439 != null && !(__r2439 == Boolean.FALSE)) {
      __r2438 = const__5;
     } else {
      __r2438 = const__6;
     }
     __r2436 = __r2438;
    }
    __r2435 = __r2436;
   }
   ((clojure.lang.Agent)a3).setErrorMode((clojure.lang.Keyword)((clojure.lang.Keyword)__r2435));
   return a3;
  }
 }
 public int getRequiredArity() {
  return 1;
 }
}
