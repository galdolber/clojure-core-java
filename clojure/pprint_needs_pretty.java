package clojure;

import clojure.lang.*;

public final class pprint_needs_pretty extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "pretty");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "flags");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "def");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "some");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "needs-pretty");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "clauses");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "params");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public pprint_needs_pretty() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object format1) {
  {
   Object format2 = format1;
   while(true) {
    Object __r5866 = ((IFn)const__0.getRawRoot()).invoke(format2);
    if (__r5866 != null && !(__r5866 == Boolean.FALSE)) {
     return Boolean.FALSE;
    } else {
     Object __r5868 = null;
     {
      Object or__3968__auto__3 = RT.get(RT.get(RT.get(((IFn)const__4.getRawRoot()).invoke(format2), Keyword.intern(null, "def")), Keyword.intern(null, "flags")), Keyword.intern(null, "pretty"));
      Object __r5869;
      Object __r5870 = or__3968__auto__3;
      if (__r5870 != null && !(__r5870 == Boolean.FALSE)) {
       __r5869 = or__3968__auto__3;
      } else {
       Object __r5871 = null;
       {
        Object or__3968__auto__4 = ((IFn)const__5.getRawRoot()).invoke(const__6.getRawRoot(), ((IFn)const__4.getRawRoot()).invoke(RT.get(RT.get(((IFn)const__4.getRawRoot()).invoke(format2), Keyword.intern(null, "params")), Keyword.intern(null, "clauses"))));
        Object __r5872;
        Object __r5873 = or__3968__auto__4;
        if (__r5873 != null && !(__r5873 == Boolean.FALSE)) {
         __r5872 = or__3968__auto__4;
        } else {
         __r5872 = ((IFn)const__5.getRawRoot()).invoke(const__6.getRawRoot(), ((IFn)const__4.getRawRoot()).invoke(RT.get(RT.get(((IFn)const__4.getRawRoot()).invoke(format2), Keyword.intern(null, "params")), Keyword.intern(null, "else"))));
        }
        __r5871 = __r5872;
       }
       __r5869 = __r5871;
      }
      __r5868 = __r5869;
     }
     Object __r5874 = __r5868;
     if (__r5874 != null && !(__r5874 == Boolean.FALSE)) {
      return Boolean.TRUE;
     } else {
      java.lang.Object format2___aux = ((IFn)const__10.getRawRoot()).invoke(format2);
      format2 = format2___aux;
      continue;
     }
    }
   }
  }
 }
}
