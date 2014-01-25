package clojure;

import clojure.lang.*;

public final class pprint_c_write_char extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "get-field");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "base");
 }
 public pprint_c_write_char() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object c2) {
  try {
   clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_c_write_char_fn__7397(c2, this1)));
   ((java.io.Writer)((IFn)const__0.getRawRoot()).invoke(this1, const__1)).write((int)RT.intCast(c2));
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
