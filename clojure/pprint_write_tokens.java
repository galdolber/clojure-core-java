package clojure;

import clojure.lang.*;

public final class pprint_write_tokens extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "type-tag");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "nl-t");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "trailing-white-space");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__10 = (clojure.lang.Var)RT.var("clojure.pprint", "write-token");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "alter");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public pprint_write_tokens() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object tokens2, java.lang.Object force_trailing_whitespace3) {
  {
   Object seq_74674 = ((IFn)const__0.getRawRoot()).invoke(tokens2);
   Object chunk_74685 = null;
   long count_74696 = 0L;
   long i_74707 = 0L;
   while(true) {
    if (clojure.lang.Numbers.lt((long)i_74707, (long)count_74696)) {
     {
      Object token8 = ((java.lang.Object)((clojure.lang.Indexed)chunk_74685).nth((int)RT.intCast(i_74707)));
      Object __r4885 = ((IFn)const__3.getRawRoot()).invoke((clojure.lang.Util.equiv(((java.lang.Object)RT.get(token8, Keyword.intern(null, "type-tag"))), ((java.lang.Object)const__6)) ? Boolean.TRUE : Boolean.FALSE));
      if (__r4885 != null && !(__r4885 == Boolean.FALSE)) {
       {
        Object temp__4115__auto__9 = RT.get(((IFn)const__8.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(this1)), Keyword.intern(null, "trailing-white-space"));
        Object __r4887 = temp__4115__auto__9;
        if (__r4887 != null && !(__r4887 == Boolean.FALSE)) {
         {
          Object tws10 = temp__4115__auto__9;
          Reflector.invokeInstanceMethod(RT.get(((IFn)const__8.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")), "write", new Object[]{tws10});
         }
        } else {
        }
       }
      } else {
      }
      ((IFn)const__10.getRawRoot()).invoke(this1, token8);
      ((IFn)const__11.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(this1), const__12.getRawRoot(), const__7, RT.get(token8, Keyword.intern(null, "trailing-white-space")));
      long i_74707___aux = clojure.lang.Numbers.unchecked_inc((long)i_74707);
      i_74707 = i_74707___aux;
      continue;
     }
    } else {
     {
      Object temp__4117__auto__11 = ((IFn)const__0.getRawRoot()).invoke(seq_74674);
      Object __r4889 = temp__4117__auto__11;
      if (__r4889 != null && !(__r4889 == Boolean.FALSE)) {
       {
        Object seq_746712 = temp__4117__auto__11;
        Object __r4891 = ((IFn)const__14.getRawRoot()).invoke(seq_746712);
        if (__r4891 != null && !(__r4891 == Boolean.FALSE)) {
         {
          Object c__4343__auto__13 = ((IFn)const__15.getRawRoot()).invoke(seq_746712);
          java.lang.Object seq_74674___aux = ((IFn)const__16.getRawRoot()).invoke(seq_746712);
          java.lang.Object chunk_74685___aux = c__4343__auto__13;
          long count_74696___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__13)));
          long i_74707___aux = clojure.lang.RT.intCast((long)0L);
          seq_74674 = seq_74674___aux;
          chunk_74685 = chunk_74685___aux;
          count_74696 = count_74696___aux;
          i_74707 = i_74707___aux;
          continue;
         }
        } else {
         {
          Object token14 = ((IFn)const__19.getRawRoot()).invoke(seq_746712);
          Object __r4893 = ((IFn)const__3.getRawRoot()).invoke((clojure.lang.Util.equiv(((java.lang.Object)RT.get(token14, Keyword.intern(null, "type-tag"))), ((java.lang.Object)const__6)) ? Boolean.TRUE : Boolean.FALSE));
          if (__r4893 != null && !(__r4893 == Boolean.FALSE)) {
           {
            Object temp__4115__auto__15 = RT.get(((IFn)const__8.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(this1)), Keyword.intern(null, "trailing-white-space"));
            Object __r4895 = temp__4115__auto__15;
            if (__r4895 != null && !(__r4895 == Boolean.FALSE)) {
             {
              Object tws16 = temp__4115__auto__15;
              Reflector.invokeInstanceMethod(RT.get(((IFn)const__8.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")), "write", new Object[]{tws16});
             }
            } else {
            }
           }
          } else {
          }
          ((IFn)const__10.getRawRoot()).invoke(this1, token14);
          ((IFn)const__11.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(this1), const__12.getRawRoot(), const__7, RT.get(token14, Keyword.intern(null, "trailing-white-space")));
          java.lang.Object seq_74674___aux = ((IFn)const__20.getRawRoot()).invoke(seq_746712);
          java.lang.Object chunk_74685___aux = null;
          long count_74696___aux = 0L;
          long i_74707___aux = 0L;
          seq_74674 = seq_74674___aux;
          chunk_74685 = chunk_74685___aux;
          count_74696 = count_74696___aux;
          i_74707 = i_74707___aux;
          continue;
         }
        }
       }
      } else {
      }
     }
    }
    break;
   }
  }
  {
   Object tws17 = RT.get(((IFn)const__8.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(this1)), Keyword.intern(null, "trailing-white-space"));
   Object __r4897 = null;
   {
    Object and__3966__auto__18 = force_trailing_whitespace3;
    Object __r4898;
    Object __r4899 = and__3966__auto__18;
    if (__r4899 != null && !(__r4899 == Boolean.FALSE)) {
     __r4898 = tws17;
    } else {
     __r4898 = and__3966__auto__18;
    }
    __r4897 = __r4898;
   }
   Object __r4900 = __r4897;
   if (__r4900 != null && !(__r4900 == Boolean.FALSE)) {
    Reflector.invokeInstanceMethod(RT.get(((IFn)const__8.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")), "write", new Object[]{tws17});
    return ((IFn)const__11.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(this1), const__12.getRawRoot(), const__7, null);
   } else {
    return null;
   }
  }
 }
}
