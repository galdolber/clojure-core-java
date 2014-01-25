package clojure;

import clojure.lang.*;

public final class core_imap_cons extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)java.util.Map.Entry.class;
  const__2 = (java.lang.Object)clojure.lang.IPersistentVector.class;
  const__3 = (java.lang.Object)0L;
  const__4 = (java.lang.Object)1L;
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 public core_imap_cons() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object o2) {
  if ((o2 instanceof java.util.Map.Entry)) {
   {
    Object pair3 = o2;
    return ((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)this1).assoc(((java.lang.Object)((java.lang.Object)((java.util.Map.Entry)pair3).getKey())), ((java.lang.Object)((java.lang.Object)((java.util.Map.Entry)pair3).getValue()))));
   }
  } else {
   if ((o2 instanceof clojure.lang.IPersistentVector)) {
    {
     Object vec4 = o2;
     return ((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)this1).assoc(((java.lang.Object)((java.lang.Object)((clojure.lang.Indexed)vec4).nth((int)RT.intCast(0L)))), ((java.lang.Object)((java.lang.Object)((clojure.lang.Indexed)vec4).nth((int)RT.intCast(1L))))));
    }
   } else {
    Object __r3717 = const__5;
    if (__r3717 != null && !(__r3717 == Boolean.FALSE)) {
     {
      Object this5 = this1;
      Object o6 = o2;
      while(true) {
       Object __r3719 = ((IFn)const__6.getRawRoot()).invoke(o6);
       if (__r3719 != null && !(__r3719 == Boolean.FALSE)) {
        {
         Object pair7 = ((IFn)const__7.getRawRoot()).invoke(o6);
         java.lang.Object this5___aux = ((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)this5).assoc(((java.lang.Object)((java.lang.Object)((java.util.Map.Entry)pair7).getKey())), ((java.lang.Object)((java.lang.Object)((java.util.Map.Entry)pair7).getValue()))));
         java.lang.Object o6___aux = ((IFn)const__8.getRawRoot()).invoke(o6);
         this5 = this5___aux;
         o6 = o6___aux;
         continue;
        }
       } else {
        return this5;
       }
      }
     }
    } else {
     return null;
    }
   }
  }
 }
}
