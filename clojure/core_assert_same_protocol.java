package clojure;

import clojure.lang.*;

public final class core_assert_same_protocol extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
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
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "resolve");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "protocol");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "bound?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "not=");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "*err*");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_assert_same_protocol() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object protocol_var1, java.lang.Object method_syms2) {
  {
   Object seq_59453 = ((IFn)const__0.getRawRoot()).invoke(method_syms2);
   Object chunk_59464 = null;
   long count_59475 = 0L;
   long i_59486 = 0L;
   while(true) {
    if (clojure.lang.Numbers.lt((long)i_59486, (long)count_59475)) {
     {
      Object m7 = ((java.lang.Object)((clojure.lang.Indexed)chunk_59464).nth((int)RT.intCast(i_59486)));
      {
       Object v8 = ((IFn)const__3.getRawRoot()).invoke(m7);
       Object p9 = RT.get(((IFn)const__5.getRawRoot()).invoke(v8), Keyword.intern(null, "protocol"));
       Object __r3784 = null;
       {
        Object and__3966__auto__10 = v8;
        Object __r3785;
        Object __r3786 = and__3966__auto__10;
        if (__r3786 != null && !(__r3786 == Boolean.FALSE)) {
         Object __r3787 = null;
         {
          Object and__3966__auto__11 = ((IFn)const__6.getRawRoot()).invoke(v8);
          Object __r3788;
          Object __r3789 = and__3966__auto__11;
          if (__r3789 != null && !(__r3789 == Boolean.FALSE)) {
           __r3788 = ((IFn)const__7.getRawRoot()).invoke(protocol_var1, p9);
          } else {
           __r3788 = and__3966__auto__11;
          }
          __r3787 = __r3788;
         }
         __r3785 = __r3787;
        } else {
         __r3785 = and__3966__auto__10;
        }
        __r3784 = __r3785;
       }
       Object __r3790 = __r3784;
       if (__r3790 != null && !(__r3790 == Boolean.FALSE)) {
        {
         ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10, const__11.get()));
         ((IFn)new clojure.core_assert_same_protocol_fn__5949(protocol_var1, p9, v8)).invoke();
        }
       } else {
       }
      }
      long i_59486___aux = clojure.lang.Numbers.unchecked_inc((long)i_59486);
      i_59486 = i_59486___aux;
      continue;
     }
    } else {
     {
      Object temp__4117__auto__12 = ((IFn)const__0.getRawRoot()).invoke(seq_59453);
      Object __r3792 = temp__4117__auto__12;
      if (__r3792 != null && !(__r3792 == Boolean.FALSE)) {
       {
        Object seq_594513 = temp__4117__auto__12;
        Object __r3794 = ((IFn)const__13.getRawRoot()).invoke(seq_594513);
        if (__r3794 != null && !(__r3794 == Boolean.FALSE)) {
         {
          Object c__4343__auto__14 = ((IFn)const__14.getRawRoot()).invoke(seq_594513);
          java.lang.Object seq_59453___aux = ((IFn)const__15.getRawRoot()).invoke(seq_594513);
          java.lang.Object chunk_59464___aux = c__4343__auto__14;
          long count_59475___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__14)));
          long i_59486___aux = clojure.lang.RT.intCast((long)0L);
          seq_59453 = seq_59453___aux;
          chunk_59464 = chunk_59464___aux;
          count_59475 = count_59475___aux;
          i_59486 = i_59486___aux;
          continue;
         }
        } else {
         {
          Object m15 = ((IFn)const__18.getRawRoot()).invoke(seq_594513);
          {
           Object v16 = ((IFn)const__3.getRawRoot()).invoke(m15);
           Object p17 = RT.get(((IFn)const__5.getRawRoot()).invoke(v16), Keyword.intern(null, "protocol"));
           Object __r3796 = null;
           {
            Object and__3966__auto__18 = v16;
            Object __r3797;
            Object __r3798 = and__3966__auto__18;
            if (__r3798 != null && !(__r3798 == Boolean.FALSE)) {
             Object __r3799 = null;
             {
              Object and__3966__auto__19 = ((IFn)const__6.getRawRoot()).invoke(v16);
              Object __r3800;
              Object __r3801 = and__3966__auto__19;
              if (__r3801 != null && !(__r3801 == Boolean.FALSE)) {
               __r3800 = ((IFn)const__7.getRawRoot()).invoke(protocol_var1, p17);
              } else {
               __r3800 = and__3966__auto__19;
              }
              __r3799 = __r3800;
             }
             __r3797 = __r3799;
            } else {
             __r3797 = and__3966__auto__18;
            }
            __r3796 = __r3797;
           }
           Object __r3802 = __r3796;
           if (__r3802 != null && !(__r3802 == Boolean.FALSE)) {
            {
             ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10, const__11.get()));
             ((IFn)new clojure.core_assert_same_protocol_fn__5951(protocol_var1, p17, v16)).invoke();
            }
           } else {
           }
          }
          java.lang.Object seq_59453___aux = ((IFn)const__19.getRawRoot()).invoke(seq_594513);
          java.lang.Object chunk_59464___aux = null;
          long count_59475___aux = 0L;
          long i_59486___aux = 0L;
          seq_59453 = seq_59453___aux;
          chunk_59464 = chunk_59464___aux;
          count_59475 = count_59475___aux;
          i_59486 = i_59486___aux;
          continue;
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
 }
}
