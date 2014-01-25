package clojure;

import clojure.lang.*;

public final class pprint_capitalize_word_writer_fn__7885 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__2 = (java.lang.Object)java.lang.String.class;
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "capitalize-string");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__6 = (java.lang.Object)java.lang.Integer.class;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "char");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 Object writer1;
 Object last_was_whitespace_QMARK_2;
 public pprint_capitalize_word_writer_fn__7885(final Object writer1, final Object last_was_whitespace_QMARK_2) {
  super();
  this.writer1 = writer1;
  this.last_was_whitespace_QMARK_2 = last_was_whitespace_QMARK_2;
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object cbuf2, java.lang.Object off3, java.lang.Object len4) {
  try {
   ((java.io.Writer)this.writer1).write((char[])((char[])cbuf2), (int)RT.intCast(off3), (int)RT.intCast(len4));
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object x2) {
  try {
   {
    Object pred__78863 = const__0.getRawRoot();
    Object expr__78874 = ((IFn)const__1.getRawRoot()).invoke(x2);
    Object __r5596 = ((IFn)pred__78863).invoke(const__2, expr__78874);
    if (__r5596 != null && !(__r5596 == Boolean.FALSE)) {
     {
      Object s5 = x2;
      ((java.io.Writer)this.writer1).write((java.lang.String)((java.lang.String)((IFn)const__3.getRawRoot()).invoke(((java.lang.String)((java.lang.String)s5).toLowerCase()), ((IFn)const__4.getRawRoot()).invoke(this.last_was_whitespace_QMARK_2))));
      if (clojure.lang.Numbers.isPos((long)((java.lang.String)s5).length())) {
       return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_capitalize_word_writer_fn__7885_fn__7889(this.last_was_whitespace_QMARK_2, s5))));
      } else {
       return null;
      }
     }
    } else {
     Object __r5599 = ((IFn)pred__78863).invoke(const__6, expr__78874);
     if (__r5599 != null && !(__r5599 == Boolean.FALSE)) {
      {
       char c6 = clojure.lang.RT.charCast(((java.lang.Object)x2));
       {
        Object __r5600;
        Object __r5601 = ((IFn)const__4.getRawRoot()).invoke(this.last_was_whitespace_QMARK_2);
        if (__r5601 != null && !(__r5601 == Boolean.FALSE)) {
         __r5600 = java.lang.Character.toUpperCase((char)clojure.lang.RT.charCast(((java.lang.Object)x2)));
        } else {
         __r5600 = c6;
        }
        char mod_c7 = (java.lang.Character)__r5600;
        ((java.io.Writer)this.writer1).write((int)clojure.lang.RT.intCast((char)mod_c7));
        return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_capitalize_word_writer_fn__7885_fn__7891(x2, this.last_was_whitespace_QMARK_2))));
       }
      }
     } else {
      Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__9.getRawRoot()).invoke("No matching clause: ", expr__78874))));
      return null;
     }
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
