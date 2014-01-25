package clojure;

import clojure.lang.*;

public final class pprint_pretty_writer_fn__7568 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__2 = (java.lang.Object)java.lang.String.class;
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "write-initial-lines");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "mode");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__7 = (java.lang.Object)java.lang.Integer.class;
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "p-write-char");
  const__9 = (java.lang.Object)java.lang.Long.class;
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public pprint_pretty_writer_fn__7568() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object x2) {
  try {
   {
    Object pred__75693 = const__0.getRawRoot();
    Object expr__75704 = ((IFn)const__1.getRawRoot()).invoke(x2);
    Object __r4967 = ((IFn)pred__75693).invoke(const__2, expr__75704);
    if (__r4967 != null && !(__r4967 == Boolean.FALSE)) {
     {
      Object s05 = ((IFn)const__3.getRawRoot()).invoke(this1, x2);
      Object s6 = ((java.lang.String)((java.lang.String)s05).replaceFirst((java.lang.String)((java.lang.String)"\\s+$"), (java.lang.String)((java.lang.String)"")));
      Object white_space7 = ((java.lang.String)((java.lang.String)s05).substring((int)clojure.lang.RT.count(((java.lang.Object)s6))));
      Object mode8 = RT.get(((IFn)const__6.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(this1)), Keyword.intern(null, "mode"));
      return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_pretty_writer_fn__7568_fn__7572(this1, mode8, s05, s6, white_space7))));
     }
    } else {
     Object __r4969 = ((IFn)pred__75693).invoke(const__7, expr__75704);
     if (__r4969 != null && !(__r4969 == Boolean.FALSE)) {
      return ((IFn)const__8.getRawRoot()).invoke(this1, x2);
     } else {
      Object __r4971 = ((IFn)pred__75693).invoke(const__9, expr__75704);
      if (__r4971 != null && !(__r4971 == Boolean.FALSE)) {
       return ((IFn)const__8.getRawRoot()).invoke(this1, x2);
      } else {
       Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__10.getRawRoot()).invoke("No matching clause: ", expr__75704))));
       return null;
      }
     }
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
