package clojure;

import clojure.lang.*;

public final class pprint_pretty_writer_fn__7564 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "mode");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "buffering");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "write-white-space");
 }
 public pprint_pretty_writer_fn__7564() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1) {
  try {
   if (clojure.lang.Util.equiv(((java.lang.Object)RT.get(((IFn)const__2.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this1)), Keyword.intern(null, "mode"))), ((java.lang.Object)const__3))) {
    return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_pretty_writer_fn__7564_fn__7565(this1))));
   } else {
    return ((IFn)const__4.getRawRoot()).invoke(this1);
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
