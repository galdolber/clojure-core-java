package clojure;

import clojure.lang.*;

public final class core_refer extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final java.lang.Object const__15;
 public static final clojure.lang.Var const__16;
 public static final java.lang.Object const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Var const__23;
 public static final clojure.lang.Var const__24;
 public static final clojure.lang.Var const__25;
 public static final clojure.lang.Var const__26;
 public static final clojure.lang.Var const__27;
 public static final clojure.lang.Var const__28;
 public static final clojure.lang.Var const__29;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "find-ns");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "ns-publics");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "rename");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "set");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "exclude");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "all");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "refer");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "keys");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "only");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__15 = (java.lang.Object)clojure.lang.Sequential.class;
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__17 = (java.lang.Object)0L;
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "ns-interns");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__24 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__25 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__28 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__29 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_refer() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object ns_sym1, java.lang.Object filters2) {
  if (clojure.lang.ObjC.objc) {
   return null;
  } else {
   {
    Object __r2731 = null;
    {
     Object or__3968__auto__3 = ((IFn)const__0.getRawRoot()).invoke(ns_sym1);
     Object __r2732;
     Object __r2733 = or__3968__auto__3;
     if (__r2733 != null && !(__r2733 == Boolean.FALSE)) {
      __r2732 = or__3968__auto__3;
     } else {
      Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke("No namespace: ", ns_sym1))));
      __r2732 = null;
     }
     __r2731 = __r2732;
    }
    Object ns4 = __r2731;
    Object fs5 = ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), filters2);
    Object nspublics6 = ((IFn)const__4.getRawRoot()).invoke(ns4);
    Object __r2734 = null;
    {
     Object or__3968__auto__7 = RT.get(fs5, Keyword.intern(null, "rename"));
     Object __r2735;
     Object __r2736 = or__3968__auto__7;
     if (__r2736 != null && !(__r2736 == Boolean.FALSE)) {
      __r2735 = or__3968__auto__7;
     } else {
      __r2735 = clojure.lang.PersistentArrayMap.EMPTY;
     }
     __r2734 = __r2735;
    }
    Object rename8 = __r2734;
    Object exclude9 = ((IFn)const__6.getRawRoot()).invoke(RT.get(fs5, Keyword.intern(null, "exclude")));
    Object __r2737;
    if (clojure.lang.Util.equiv(((java.lang.Object)const__9), ((java.lang.Object)RT.get(fs5, Keyword.intern(null, "refer"))))) {
     __r2737 = ((IFn)const__11.getRawRoot()).invoke(nspublics6);
    } else {
     Object __r2738 = null;
     {
      Object or__3968__auto__10 = RT.get(fs5, Keyword.intern(null, "refer"));
      Object __r2739;
      Object __r2740 = or__3968__auto__10;
      if (__r2740 != null && !(__r2740 == Boolean.FALSE)) {
       __r2739 = or__3968__auto__10;
      } else {
       Object __r2741 = null;
       {
        Object or__3968__auto__11 = RT.get(fs5, Keyword.intern(null, "only"));
        Object __r2742;
        Object __r2743 = or__3968__auto__11;
        if (__r2743 != null && !(__r2743 == Boolean.FALSE)) {
         __r2742 = or__3968__auto__11;
        } else {
         __r2742 = ((IFn)const__11.getRawRoot()).invoke(nspublics6);
        }
        __r2741 = __r2742;
       }
       __r2739 = __r2741;
      }
      __r2738 = __r2739;
     }
     __r2737 = __r2738;
    }
    Object to_do12 = __r2737;
    Object __r2745 = null;
    {
     Object and__3966__auto__13 = to_do12;
     Object __r2746;
     Object __r2747 = and__3966__auto__13;
     if (__r2747 != null && !(__r2747 == Boolean.FALSE)) {
      __r2746 = ((IFn)const__13.getRawRoot()).invoke(((to_do12 instanceof clojure.lang.Sequential) ? Boolean.TRUE : Boolean.FALSE));
     } else {
      __r2746 = and__3966__auto__13;
     }
     __r2745 = __r2746;
    }
    Object __r2748 = __r2745;
    if (__r2748 != null && !(__r2748 == Boolean.FALSE)) {
     Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)":only/:refer value must be a sequential collection of symbols")));
    } else {
    }
    {
     Object seq_452614 = ((IFn)const__16.getRawRoot()).invoke(to_do12);
     Object chunk_452715 = null;
     long count_452816 = 0L;
     long i_452917 = 0L;
     while(true) {
      if (clojure.lang.Numbers.lt((long)i_452917, (long)count_452816)) {
       {
        Object sym18 = ((java.lang.Object)((clojure.lang.Indexed)chunk_452715).nth((int)RT.intCast(i_452917)));
        Object __r2751 = ((IFn)exclude9).invoke(sym18);
        if (__r2751 != null && !(__r2751 == Boolean.FALSE)) {
        } else {
         {
          Object v19 = ((IFn)nspublics6).invoke(sym18);
          Object __r2753 = v19;
          if (__r2753 != null && !(__r2753 == Boolean.FALSE)) {
          } else {
           Object __r2754;
           Object __r2755 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)((IFn)const__20.getRawRoot()).invoke(ns4)), ((java.lang.Object)sym18)));
           if (__r2755 != null && !(__r2755 == Boolean.FALSE)) {
            __r2754 = ((IFn)const__1.getRawRoot()).invoke(sym18, " is not public");
           } else {
            __r2754 = ((IFn)const__1.getRawRoot()).invoke(sym18, " does not exist");
           }
           Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)__r2754)));
          }
          Object __r2756 = null;
          {
           Object or__3968__auto__20 = ((IFn)rename8).invoke(sym18);
           Object __r2757;
           Object __r2758 = or__3968__auto__20;
           if (__r2758 != null && !(__r2758 == Boolean.FALSE)) {
            __r2757 = or__3968__auto__20;
           } else {
            __r2757 = sym18;
           }
           __r2756 = __r2757;
          }
          ((clojure.lang.Namespace)const__21.get()).refer((clojure.lang.Symbol)((clojure.lang.Symbol)__r2756), (clojure.lang.Var)((clojure.lang.Var)v19));
         }
        }
        long i_452917___aux = clojure.lang.Numbers.unchecked_inc((long)i_452917);
        i_452917 = i_452917___aux;
        continue;
       }
      } else {
       {
        Object temp__4117__auto__21 = ((IFn)const__16.getRawRoot()).invoke(seq_452614);
        Object __r2760 = temp__4117__auto__21;
        if (__r2760 != null && !(__r2760 == Boolean.FALSE)) {
         {
          Object seq_452622 = temp__4117__auto__21;
          Object __r2762 = ((IFn)const__23.getRawRoot()).invoke(seq_452622);
          if (__r2762 != null && !(__r2762 == Boolean.FALSE)) {
           {
            Object c__4343__auto__23 = ((IFn)const__24.getRawRoot()).invoke(seq_452622);
            java.lang.Object seq_452614___aux = ((IFn)const__25.getRawRoot()).invoke(seq_452622);
            java.lang.Object chunk_452715___aux = c__4343__auto__23;
            long count_452816___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__23)));
            long i_452917___aux = clojure.lang.RT.intCast((long)0L);
            seq_452614 = seq_452614___aux;
            chunk_452715 = chunk_452715___aux;
            count_452816 = count_452816___aux;
            i_452917 = i_452917___aux;
            continue;
           }
          } else {
           {
            Object sym24 = ((IFn)const__28.getRawRoot()).invoke(seq_452622);
            Object __r2764 = ((IFn)exclude9).invoke(sym24);
            if (__r2764 != null && !(__r2764 == Boolean.FALSE)) {
            } else {
             {
              Object v25 = ((IFn)nspublics6).invoke(sym24);
              Object __r2766 = v25;
              if (__r2766 != null && !(__r2766 == Boolean.FALSE)) {
              } else {
               Object __r2767;
               Object __r2768 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)((IFn)const__20.getRawRoot()).invoke(ns4)), ((java.lang.Object)sym24)));
               if (__r2768 != null && !(__r2768 == Boolean.FALSE)) {
                __r2767 = ((IFn)const__1.getRawRoot()).invoke(sym24, " is not public");
               } else {
                __r2767 = ((IFn)const__1.getRawRoot()).invoke(sym24, " does not exist");
               }
               Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)__r2767)));
              }
              Object __r2769 = null;
              {
               Object or__3968__auto__26 = ((IFn)rename8).invoke(sym24);
               Object __r2770;
               Object __r2771 = or__3968__auto__26;
               if (__r2771 != null && !(__r2771 == Boolean.FALSE)) {
                __r2770 = or__3968__auto__26;
               } else {
                __r2770 = sym24;
               }
               __r2769 = __r2770;
              }
              ((clojure.lang.Namespace)const__21.get()).refer((clojure.lang.Symbol)((clojure.lang.Symbol)__r2769), (clojure.lang.Var)((clojure.lang.Var)v25));
             }
            }
            java.lang.Object seq_452614___aux = ((IFn)const__29.getRawRoot()).invoke(seq_452622);
            java.lang.Object chunk_452715___aux = null;
            long count_452816___aux = 0L;
            long i_452917___aux = 0L;
            seq_452614 = seq_452614___aux;
            chunk_452715 = chunk_452715___aux;
            count_452816 = count_452816___aux;
            i_452917 = i_452917___aux;
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
 }
 public int getRequiredArity() {
  return 1;
 }
}
