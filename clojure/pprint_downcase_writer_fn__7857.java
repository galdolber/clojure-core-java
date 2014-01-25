package clojure;

import clojure.lang.*;

public final class pprint_downcase_writer_fn__7857 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__2 = (java.lang.Object)java.lang.String.class;
  const__3 = (java.lang.Object)java.lang.Integer.class;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "char");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 Object writer1;
 public pprint_downcase_writer_fn__7857(final Object writer1) {
  super();
  this.writer1 = writer1;
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
    Object pred__78583 = const__0.getRawRoot();
    Object expr__78594 = ((IFn)const__1.getRawRoot()).invoke(x2);
    Object __r5573 = ((IFn)pred__78583).invoke(const__2, expr__78594);
    if (__r5573 != null && !(__r5573 == Boolean.FALSE)) {
     {
      Object s5 = x2;
      ((java.io.Writer)this.writer1).write((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.String)s5).toLowerCase())));
      return null;
     }
    } else {
     Object __r5575 = ((IFn)pred__78583).invoke(const__3, expr__78594);
     if (__r5575 != null && !(__r5575 == Boolean.FALSE)) {
      {
       Object c6 = x2;
       ((java.io.Writer)this.writer1).write((int)clojure.lang.RT.intCast((char)java.lang.Character.toLowerCase((char)clojure.lang.RT.charCast(((java.lang.Object)c6)))));
       return null;
      }
     } else {
      Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__6.getRawRoot()).invoke("No matching clause: ", expr__78594))));
      return null;
     }
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
