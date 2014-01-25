package clojure;

import clojure.lang.*;

public final class pprint_fn__7460 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Keyword const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "type");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "mandatory");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "fill");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "done-nl");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block");
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "emit-nl");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "trailing-white-space");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "base");
 }
 public pprint_fn__7460() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object token2) {
  try {
   Object __r4875 = null;
   {
    boolean or__3968__auto__3 = clojure.lang.Util.equiv(((java.lang.Object)RT.get(token2, Keyword.intern(null, "type"))), ((java.lang.Object)const__2));
    Object __r4876;
    if (or__3968__auto__3) {
     __r4876 = (or__3968__auto__3 ? Boolean.TRUE : Boolean.FALSE);
    } else {
     Object __r4877 = null;
     {
      Object and__3966__auto__4 = ((IFn)const__3.getRawRoot()).invoke((clojure.lang.Util.equiv(((java.lang.Object)RT.get(token2, Keyword.intern(null, "type"))), ((java.lang.Object)const__4)) ? Boolean.TRUE : Boolean.FALSE));
      Object __r4878;
      Object __r4879 = and__3966__auto__4;
      if (__r4879 != null && !(__r4879 == Boolean.FALSE)) {
       __r4878 = ((IFn)const__5.getRawRoot()).invoke(RT.get(RT.get(token2, Keyword.intern(null, "logical-block")), Keyword.intern(null, "done-nl")));
      } else {
       __r4878 = and__3966__auto__4;
      }
      __r4877 = __r4878;
     }
     __r4876 = __r4877;
    }
    __r4875 = __r4876;
   }
   Object __r4880 = __r4875;
   if (__r4880 != null && !(__r4880 == Boolean.FALSE)) {
    ((IFn)const__8.getRawRoot()).invoke(this1, token2);
   } else {
    {
     Object temp__4115__auto__5 = RT.get(((IFn)const__5.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(this1)), Keyword.intern(null, "trailing-white-space"));
     Object __r4882 = temp__4115__auto__5;
     if (__r4882 != null && !(__r4882 == Boolean.FALSE)) {
      {
       Object tws6 = temp__4115__auto__5;
       Reflector.invokeInstanceMethod(RT.get(((IFn)const__5.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")), "write", new Object[]{tws6});
      }
     } else {
     }
    }
   }
   return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_fn__7460_fn__7461(this1))));
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
