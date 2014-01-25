package clojure.test;

import clojure.lang.*;

public final class junit_start_element extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
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
 public static final clojure.lang.Var const__20;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.test.junit", "indent");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__7 = (java.lang.Object)1L;
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__9 = (clojure.lang.Var)RT.var("clojure.test.junit", "escape-xml");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__19 = (clojure.lang.Var)RT.var("clojure.test.junit", "*depth*");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public junit_start_element() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object tag1, java.lang.Object pretty2, java.lang.Object p__72583) {
  {
   Object vec__72594 = p__72583;
   Object attrs5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__72594), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object __r4764 = pretty2;
   if (__r4764 != null && !(__r4764 == Boolean.FALSE)) {
    ((IFn)const__2.getRawRoot()).invoke();
   } else {
   }
   ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke("<", tag1));
   Object __r4766 = ((IFn)const__5.getRawRoot()).invoke(attrs5);
   if (__r4766 != null && !(__r4766 == Boolean.FALSE)) {
    {
     Object seq_72606 = ((IFn)const__5.getRawRoot()).invoke(attrs5);
     Object chunk_72617 = null;
     long count_72628 = 0L;
     long i_72639 = 0L;
     while(true) {
      if (clojure.lang.Numbers.lt((long)i_72639, (long)count_72628)) {
       {
        Object vec__726410 = ((java.lang.Object)((clojure.lang.Indexed)chunk_72617).nth((int)RT.intCast(i_72639)));
        Object key11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__726410), (int)RT.intCast(0L), ((java.lang.Object)null)));
        Object value12 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__726410), (int)RT.intCast(1L), ((java.lang.Object)null)));
        ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(" ", ((IFn)const__8.getRawRoot()).invoke(key11), "=\"", ((IFn)const__9.getRawRoot()).invoke(value12), "\""));
        long i_72639___aux = clojure.lang.Numbers.unchecked_inc((long)i_72639);
        i_72639 = i_72639___aux;
        continue;
       }
      } else {
       {
        Object temp__4117__auto__13 = ((IFn)const__5.getRawRoot()).invoke(seq_72606);
        Object __r4769 = temp__4117__auto__13;
        if (__r4769 != null && !(__r4769 == Boolean.FALSE)) {
         {
          Object seq_726014 = temp__4117__auto__13;
          Object __r4771 = ((IFn)const__11.getRawRoot()).invoke(seq_726014);
          if (__r4771 != null && !(__r4771 == Boolean.FALSE)) {
           {
            Object c__4343__auto__15 = ((IFn)const__12.getRawRoot()).invoke(seq_726014);
            java.lang.Object seq_72606___aux = ((IFn)const__13.getRawRoot()).invoke(seq_726014);
            java.lang.Object chunk_72617___aux = c__4343__auto__15;
            long count_72628___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__15)));
            long i_72639___aux = clojure.lang.RT.intCast((long)0L);
            seq_72606 = seq_72606___aux;
            chunk_72617 = chunk_72617___aux;
            count_72628 = count_72628___aux;
            i_72639 = i_72639___aux;
            continue;
           }
          } else {
           {
            Object vec__726516 = ((IFn)const__16.getRawRoot()).invoke(seq_726014);
            Object key17 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__726516), (int)RT.intCast(0L), ((java.lang.Object)null)));
            Object value18 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__726516), (int)RT.intCast(1L), ((java.lang.Object)null)));
            ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(" ", ((IFn)const__8.getRawRoot()).invoke(key17), "=\"", ((IFn)const__9.getRawRoot()).invoke(value18), "\""));
            java.lang.Object seq_72606___aux = ((IFn)const__17.getRawRoot()).invoke(seq_726014);
            java.lang.Object chunk_72617___aux = null;
            long count_72628___aux = 0L;
            long i_72639___aux = 0L;
            seq_72606 = seq_72606___aux;
            chunk_72617 = chunk_72617___aux;
            count_72628 = count_72628___aux;
            i_72639 = i_72639___aux;
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
   } else {
   }
   ((IFn)const__3.getRawRoot()).invoke(">");
   Object __r4773 = pretty2;
   if (__r4773 != null && !(__r4773 == Boolean.FALSE)) {
    ((IFn)const__18.getRawRoot()).invoke();
   } else {
   }
   return const__19.set(((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)const__19.get()))));
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
