package clojure;

import clojure.lang.*;

public final class pprint_fn__7443 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block-callback");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "start");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block");
 }
 public pprint_fn__7443() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object token2) {
  try {
   {
    Object temp__4117__auto__3 = RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this1)), Keyword.intern(null, "logical-block-callback"));
    Object __r4864 = temp__4117__auto__3;
    if (__r4864 != null && !(__r4864 == Boolean.FALSE)) {
     {
      Object cb4 = temp__4117__auto__3;
      ((IFn)cb4).invoke(const__2);
     }
    } else {
    }
   }
   {
    Object lb5 = RT.get(token2, Keyword.intern(null, "logical-block"));
    return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_fn__7443_fn__7444(lb5, this1))));
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
