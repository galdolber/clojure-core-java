package clojure;

import clojure.lang.*;

public final class pprint_p_write_char extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "mode");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "writing");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "write-white-space");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__6 = (java.lang.Object)Character.valueOf((char)10);
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "write-initial-lines");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "pos");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public pprint_p_write_char() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object c2) {
  try {
   if (clojure.lang.Util.equiv(((java.lang.Object)RT.get(((IFn)const__2.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this1)), Keyword.intern(null, "mode"))), ((java.lang.Object)const__3))) {
    ((IFn)const__4.getRawRoot()).invoke(this1);
    return Reflector.invokeInstanceMethod(RT.get(((IFn)const__2.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")), "write", new Object[]{c2});
   } else {
    if (clojure.lang.Util.equiv(((java.lang.Object)c2), ((java.lang.Object)const__6))) {
     return ((IFn)const__7.getRawRoot()).invoke(this1, "\n");
    } else {
     {
      Object oldpos3 = RT.get(((IFn)const__2.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this1)), Keyword.intern(null, "pos"));
      Object newpos4 = ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)oldpos3)));
      return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_p_write_char_fn__7557(this1, oldpos3, newpos4, c2))));
     }
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
