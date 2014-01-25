package clojure;

import clojure.lang.*;

public final class pprint_write_white_space extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "trailing-white-space");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "base");
 }
 public pprint_write_white_space() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1) {
  try {
   {
    Object temp__4117__auto__2 = RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this1)), Keyword.intern(null, "trailing-white-space"));
    Object __r4950 = temp__4117__auto__2;
    if (__r4950 != null && !(__r4950 == Boolean.FALSE)) {
     {
      Object tws3 = temp__4117__auto__2;
      Reflector.invokeInstanceMethod(RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")), "write", new Object[]{tws3});
      return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_write_white_space_fn__7544(this1))));
     }
    } else {
     return null;
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
