package clojure;

import clojure.lang.*;

public final class pprint_column_writer_fn__7401 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "get-field");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__4 = (java.lang.Object)java.lang.String.class;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__6 = (java.lang.Object)Character.valueOf((char)10);
  const__7 = (java.lang.Object)java.lang.Integer.class;
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "c-write-char");
  const__9 = (java.lang.Object)java.lang.Long.class;
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public pprint_column_writer_fn__7401() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object cbuf2, java.lang.Object off3, java.lang.Object len4) {
  try {
   {
    Object writer5 = ((IFn)const__0.getRawRoot()).invoke(this1, const__1);
    ((java.io.Writer)writer5).write((char[])((char[])cbuf2), (int)RT.intCast(off3), (int)RT.intCast(len4));
    return null;
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object x2) {
  try {
   {
    Object pred__74023 = const__2.getRawRoot();
    Object expr__74034 = ((IFn)const__3.getRawRoot()).invoke(x2);
    Object __r4847 = ((IFn)pred__74023).invoke(const__4, expr__74034);
    if (__r4847 != null && !(__r4847 == Boolean.FALSE)) {
     {
      Object s5 = x2;
      int nl6 = ((java.lang.String)s5).lastIndexOf((int)clojure.lang.RT.intCast(((java.lang.Object)const__6)));
      clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_column_writer_fn__7401_fn__7405(nl6, this1, s5)));
      ((java.io.Writer)((IFn)const__0.getRawRoot()).invoke(this1, const__1)).write((java.lang.String)((java.lang.String)s5));
      return null;
     }
    } else {
     Object __r4849 = ((IFn)pred__74023).invoke(const__7, expr__74034);
     if (__r4849 != null && !(__r4849 == Boolean.FALSE)) {
      return ((IFn)const__8.getRawRoot()).invoke(this1, x2);
     } else {
      Object __r4851 = ((IFn)pred__74023).invoke(const__9, expr__74034);
      if (__r4851 != null && !(__r4851 == Boolean.FALSE)) {
       return ((IFn)const__8.getRawRoot()).invoke(this1, x2);
      } else {
       Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__10.getRawRoot()).invoke("No matching clause: ", expr__74034))));
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
