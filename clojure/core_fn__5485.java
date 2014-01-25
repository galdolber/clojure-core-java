package clojure;

import clojure.lang.*;

public final class core_fn__5485 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final java.lang.Object const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.Keyword const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__4 = (java.lang.Object)1L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__6 = (java.lang.Object)Character.valueOf((char)92);
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "not=");
  const__8 = (java.lang.Object)Character.valueOf((char)69);
  const__9 = (java.lang.Object)Character.valueOf((char)81);
  const__10 = (java.lang.Object)Character.valueOf((char)34);
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "else");
 }
 public core_fn__5485() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1, java.lang.Object w2) {
  try {
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"#\""));
   {
    Object G__54873 = ((IFn)const__0.getRawRoot()).invoke(((java.lang.String)((java.util.regex.Pattern)p1).pattern()));
    Object vec__54884 = G__54873;
    Object c5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__54884), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object r6 = ((IFn)const__3.getRawRoot()).invoke(vec__54884, const__4);
    Object s7 = vec__54884;
    Object qmode8 = Boolean.FALSE;
    {
     Object G__54879 = G__54873;
     Object qmode10 = qmode8;
     while(true) {
      {
       Object vec__548911 = G__54879;
       Object c12 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__548911), (int)RT.intCast(0L), ((java.lang.Object)null)));
       Object r13 = ((IFn)const__3.getRawRoot()).invoke(vec__548911, const__4);
       Object s14 = vec__548911;
       Object qmode15 = qmode10;
       Object __r3477 = s14;
       if (__r3477 != null && !(__r3477 == Boolean.FALSE)) {
        if (clojure.lang.Util.equiv(((java.lang.Object)c12), ((java.lang.Object)const__6))) {
         {
          Object vec__549016 = r13;
          Object c217 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__549016), (int)RT.intCast(0L), ((java.lang.Object)null)));
          Object r218 = ((IFn)const__3.getRawRoot()).invoke(vec__549016, const__4);
          ((java.io.Writer)w2).append((char)((Character)const__6).charValue());
          ((java.io.Writer)w2).append((char)((Character)c217).charValue());
          Object __r3480 = qmode15;
          if (__r3480 != null && !(__r3480 == Boolean.FALSE)) {
           java.lang.Object G__54879___aux = r218;
           java.lang.Object qmode10___aux = ((IFn)const__7.getRawRoot()).invoke(c217, const__8);
           G__54879 = G__54879___aux;
           qmode10 = qmode10___aux;
           continue;
          } else {
           java.lang.Object G__54879___aux = r218;
           java.lang.Object qmode10___aux = (clojure.lang.Util.equiv(((java.lang.Object)c217), ((java.lang.Object)const__9)) ? Boolean.TRUE : Boolean.FALSE);
           G__54879 = G__54879___aux;
           qmode10 = qmode10___aux;
           continue;
          }
         }
        } else {
         if (clojure.lang.Util.equiv(((java.lang.Object)c12), ((java.lang.Object)const__10))) {
          Object __r3483 = qmode15;
          if (__r3483 != null && !(__r3483 == Boolean.FALSE)) {
           ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"\\E\\\"\\Q"));
          } else {
           ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"\\\""));
          }
          java.lang.Object G__54879___aux = r13;
          java.lang.Object qmode10___aux = qmode15;
          G__54879 = G__54879___aux;
          qmode10 = qmode10___aux;
          continue;
         } else {
          Object __r3485 = const__11;
          if (__r3485 != null && !(__r3485 == Boolean.FALSE)) {
           ((java.io.Writer)w2).append((char)((Character)c12).charValue());
           java.lang.Object G__54879___aux = r13;
           java.lang.Object qmode10___aux = qmode15;
           G__54879 = G__54879___aux;
           qmode10 = qmode10___aux;
           continue;
          } else {
          }
         }
        }
       } else {
       }
      }
      break;
     }
    }
   }
   return ((java.io.Writer)((java.io.Writer)w2).append((char)((Character)const__10).charValue()));
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
