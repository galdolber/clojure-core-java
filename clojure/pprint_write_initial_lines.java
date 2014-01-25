package clojure;

import clojure.lang.*;

public final class pprint_write_initial_lines extends clojure.lang.AFunction {
 public static final java.lang.Object const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 static {
  const__0 = (java.lang.Object)(-1L);
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__3 = (java.lang.Object)1L;
 }
 public pprint_write_initial_lines() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object s2) {
  try {
   {
    Object lines3 = ((java.lang.String[])((java.lang.String)s2).split((java.lang.String)((java.lang.String)"\n"), (int)RT.intCast(-1L)));
    if (clojure.lang.Util.equiv((long)clojure.lang.RT.count(((java.lang.Object)lines3)), (long)1L)) {
     return s2;
    } else {
     return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_write_initial_lines_fn__7548(this1, lines3))));
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
