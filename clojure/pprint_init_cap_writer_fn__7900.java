package clojure;

import clojure.lang.*;

public final class pprint_init_cap_writer_fn__7900 extends clojure.lang.AFunction {
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
 public static final java.lang.Object const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final java.lang.Object const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__2 = (java.lang.Object)java.lang.String.class;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "re-matcher");
  const__6 = (java.lang.Object)java.util.regex.Pattern.compile("\\S");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "re-find");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__10 = (java.lang.Object)0L;
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__13 = (java.lang.Object)java.lang.Integer.class;
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "char");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "int");
 }
 Object capped2;
 Object writer1;
 public pprint_init_cap_writer_fn__7900(final Object capped2, final Object writer1) {
  super();
  this.capped2 = capped2;
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
    Object pred__79013 = const__0.getRawRoot();
    Object expr__79024 = ((IFn)const__1.getRawRoot()).invoke(x2);
    Object __r5603 = ((IFn)pred__79013).invoke(const__2, expr__79024);
    if (__r5603 != null && !(__r5603 == Boolean.FALSE)) {
     {
      Object s5 = ((java.lang.String)((java.lang.String)x2).toLowerCase());
      Object __r5605 = ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(this.capped2));
      if (__r5605 != null && !(__r5605 == Boolean.FALSE)) {
       {
        Object m6 = ((IFn)const__5.getRawRoot()).invoke(const__6, s5);
        Object match7 = ((IFn)const__7.getRawRoot()).invoke(m6);
        Object __r5606 = null;
        {
         Object and__3966__auto__8 = match7;
         Object __r5607;
         Object __r5608 = and__3966__auto__8;
         if (__r5608 != null && !(__r5608 == Boolean.FALSE)) {
          __r5607 = Integer.valueOf(((java.util.regex.Matcher)m6).start());
         } else {
          __r5607 = and__3966__auto__8;
         }
         __r5606 = __r5607;
        }
        Object offset9 = __r5606;
        Object __r5610 = offset9;
        if (__r5610 != null && !(__r5610 == Boolean.FALSE)) {
         ((java.io.Writer)this.writer1).write((java.lang.String)((java.lang.String)((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(s5, const__10, offset9), Character.valueOf(java.lang.Character.toUpperCase((char)((Character)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)s5), (int)RT.intCast(offset9)))).charValue())), ((java.lang.String)((java.lang.String)((IFn)const__9.getRawRoot()).invoke(s5, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)offset9))))).toLowerCase()))));
         return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_init_cap_writer_fn__7900_fn__7904(this.capped2))));
        } else {
         ((java.io.Writer)this.writer1).write((java.lang.String)((java.lang.String)s5));
         return null;
        }
       }
      } else {
       ((java.io.Writer)this.writer1).write((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.String)s5).toLowerCase())));
       return null;
      }
     }
    } else {
     Object __r5612 = ((IFn)pred__79013).invoke(const__13, expr__79024);
     if (__r5612 != null && !(__r5612 == Boolean.FALSE)) {
      {
       Object c10 = Character.valueOf(clojure.lang.RT.charCast(((java.lang.Object)x2)));
       Object __r5614 = null;
       {
        Object and__3966__auto__11 = ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(this.capped2));
        Object __r5615;
        Object __r5616 = and__3966__auto__11;
        if (__r5616 != null && !(__r5616 == Boolean.FALSE)) {
         __r5615 = (java.lang.Character.isLetter((char)((Character)c10).charValue()) ? Boolean.TRUE : Boolean.FALSE);
        } else {
         __r5615 = and__3966__auto__11;
        }
        __r5614 = __r5615;
       }
       Object __r5617 = __r5614;
       if (__r5617 != null && !(__r5617 == Boolean.FALSE)) {
        clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_init_cap_writer_fn__7900_fn__7906(this.capped2)));
        ((java.io.Writer)this.writer1).write((int)clojure.lang.RT.intCast((char)java.lang.Character.toUpperCase((char)((Character)c10).charValue())));
        return null;
       } else {
        ((java.io.Writer)this.writer1).write((int)clojure.lang.RT.intCast((char)java.lang.Character.toLowerCase((char)((Character)c10).charValue())));
        return null;
       }
      }
     } else {
      Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__8.getRawRoot()).invoke("No matching clause: ", expr__79024))));
      return null;
     }
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
