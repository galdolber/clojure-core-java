package clojure;

import clojure.lang.*;

public final class core_io_BANG_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Symbol const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Symbol const__10;
 public static final clojure.lang.Symbol const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__6 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__7 = (clojure.lang.Symbol)Symbol.intern("clojure.lang.LockingTransaction", "isRunning");
  const__8 = (clojure.lang.Symbol)Symbol.intern(null, "throw");
  const__9 = (clojure.lang.Symbol)Symbol.intern(null, "new");
  const__10 = (clojure.lang.Symbol)Symbol.intern(null, "java.lang.IllegalStateException");
  const__11 = (clojure.lang.Symbol)Symbol.intern(null, "do");
 }
 public core_io_BANG_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object body3) {
  {
   Object __r2451;
   Object __r2452 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(body3));
   if (__r2452 != null && !(__r2452 == Boolean.FALSE)) {
    __r2451 = ((IFn)const__1.getRawRoot()).invoke(body3);
   } else {
    __r2451 = null;
   }
   Object message4 = __r2451;
   Object __r2453;
   Object __r2454 = message4;
   if (__r2454 != null && !(__r2454 == Boolean.FALSE)) {
    __r2453 = ((IFn)const__2.getRawRoot()).invoke(body3);
   } else {
    __r2453 = body3;
   }
   Object body5 = __r2453;
   Object __r2455 = null;
   {
    Object or__3968__auto__6 = message4;
    Object __r2456;
    Object __r2457 = or__3968__auto__6;
    if (__r2457 != null && !(__r2457 == Boolean.FALSE)) {
     __r2456 = or__3968__auto__6;
    } else {
     __r2456 = "I/O in transaction";
    }
    __r2455 = __r2456;
   }
   return ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__6), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__7)))), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__8), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__9), ((IFn)const__5.getRawRoot()).invoke(const__10), ((IFn)const__5.getRawRoot()).invoke(__r2455))))))), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__11), body5)))));
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
