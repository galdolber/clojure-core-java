package clojure;

import clojure.lang.*;

public final class pprint_emit_nl extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 public static final java.lang.Object const__11;
 public static final clojure.lang.Var const__12;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "pp-newline");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "per-line-prefix");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "indent");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__11 = (java.lang.Object)Character.valueOf((char)32);
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "update-nl-state");
 }
 public pprint_emit_nl() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object nl2) {
  try {
   Reflector.invokeInstanceMethod(RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")), "write", new Object[]{((IFn)const__2.getRawRoot()).invoke()});
   clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_emit_nl_fn__7515(this1)));
   {
    Object lb3 = RT.get(nl2, Keyword.intern(null, "logical-block"));
    Object prefix4 = RT.get(lb3, Keyword.intern(null, "per-line-prefix"));
    Object __r4927 = prefix4;
    if (__r4927 != null && !(__r4927 == Boolean.FALSE)) {
     Reflector.invokeInstanceMethod(RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")), "write", new Object[]{prefix4});
    } else {
    }
    {
     Object istr5 = ((IFn)const__5.getRawRoot()).invoke(const__6.getRawRoot(), ((IFn)const__7.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(RT.get(lb3, Keyword.intern(null, "indent")))), (long)clojure.lang.RT.count(((java.lang.Object)prefix4)))), const__11));
     Reflector.invokeInstanceMethod(RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")), "write", new Object[]{istr5});
    }
    return ((IFn)const__12.getRawRoot()).invoke(lb3);
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
