package clojure;

import clojure.lang.*;

public final class core_load_libs extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.IPersistentSet const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final java.lang.Object const__19;
 public static final clojure.lang.Var const__20;
 public static final java.lang.Object const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Var const__23;
 public static final clojure.lang.Var const__24;
 public static final clojure.lang.Var const__25;
 public static final clojure.lang.Var const__26;
 public static final clojure.lang.Var const__27;
 public static final java.lang.Object const__28;
 public static final clojure.lang.Var const__29;
 public static final clojure.lang.Var const__30;
 public static final clojure.lang.Var const__31;
 public static final clojure.lang.Var const__32;
 public static final clojure.lang.Var const__33;
 public static final clojure.lang.Var const__34;
 public static final clojure.lang.Var const__35;
 public static final clojure.lang.Var const__36;
 public static final clojure.lang.Var const__37;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "filter");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "keyword?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "interleave");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "complement");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "as");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "require");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "refer");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "reload-all");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "verbose");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "use");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "reload");
  const__12 = (clojure.lang.IPersistentSet)PersistentHashSet.create(Keyword.intern(null, "as"), Keyword.intern(null, "require"), Keyword.intern(null, "refer"), Keyword.intern(null, "reload-all"), Keyword.intern(null, "verbose"), Keyword.intern(null, "use"), Keyword.intern(null, "reload"));
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "remove");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "throw-if");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__19 = (java.lang.Object)Character.valueOf((char)44);
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__21 = (java.lang.Object)0L;
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "libspec?");
  const__24 = (clojure.lang.Var)RT.var("clojure.core", "load-lib");
  const__25 = (clojure.lang.Var)RT.var("clojure.core", "prependss");
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__28 = (java.lang.Object)1L;
  const__29 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__31 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__32 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__33 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__34 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__35 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__36 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__37 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_load_libs() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object args1) {
  {
   Object flags2 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), args1);
   Object opts3 = ((IFn)const__2.getRawRoot()).invoke(flags2, ((IFn)const__3.getRawRoot()).invoke(Boolean.TRUE));
   Object args4 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__1.getRawRoot()), args1);
   {
    Object supported5 = const__12;
    Object unsupported6 = ((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(supported5, flags2));
    ((IFn)const__15.getRawRoot()).invoke(unsupported6, ((IFn)const__16.getRawRoot()).invoke(const__17.getRawRoot(), "Unsupported option(s) supplied: ", ((IFn)const__18.getRawRoot()).invoke(const__19, unsupported6)));
   }
   ((IFn)const__15.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(args4)), "Nothing specified to load");
   {
    Object seq_50057 = ((IFn)const__13.getRawRoot()).invoke(args4);
    Object chunk_50068 = null;
    long count_50079 = 0L;
    long i_500810 = 0L;
    while(true) {
     if (clojure.lang.Numbers.lt((long)i_500810, (long)count_50079)) {
      {
       Object arg11 = ((java.lang.Object)((clojure.lang.Indexed)chunk_50068).nth((int)RT.intCast(i_500810)));
       Object __r3200 = ((IFn)const__23.getRawRoot()).invoke(arg11);
       if (__r3200 != null && !(__r3200 == Boolean.FALSE)) {
        ((IFn)const__16.getRawRoot()).invoke(const__24.getRawRoot(), null, ((IFn)const__25.getRawRoot()).invoke(arg11, opts3));
       } else {
        {
         Object vec__500912 = arg11;
         Object prefix13 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__500912), (int)RT.intCast(0L), ((java.lang.Object)null)));
         Object args14 = ((IFn)const__27.getRawRoot()).invoke(vec__500912, const__28);
         ((IFn)const__15.getRawRoot()).invoke((clojure.lang.Util.identical(((java.lang.Object)prefix13), ((java.lang.Object)null)) ? Boolean.TRUE : Boolean.FALSE), "prefix cannot be nil");
         {
          Object seq_501015 = ((IFn)const__13.getRawRoot()).invoke(args14);
          Object chunk_501116 = null;
          long count_501217 = 0L;
          long i_501318 = 0L;
          while(true) {
           if (clojure.lang.Numbers.lt((long)i_501318, (long)count_501217)) {
            {
             Object arg19 = ((java.lang.Object)((clojure.lang.Indexed)chunk_501116).nth((int)RT.intCast(i_501318)));
             ((IFn)const__16.getRawRoot()).invoke(const__24.getRawRoot(), prefix13, ((IFn)const__25.getRawRoot()).invoke(arg19, opts3));
             long i_501318___aux = clojure.lang.Numbers.unchecked_inc((long)i_501318);
             i_501318 = i_501318___aux;
             continue;
            }
           } else {
            {
             Object temp__4117__auto__20 = ((IFn)const__13.getRawRoot()).invoke(seq_501015);
             Object __r3203 = temp__4117__auto__20;
             if (__r3203 != null && !(__r3203 == Boolean.FALSE)) {
              {
               Object seq_501021 = temp__4117__auto__20;
               Object __r3205 = ((IFn)const__31.getRawRoot()).invoke(seq_501021);
               if (__r3205 != null && !(__r3205 == Boolean.FALSE)) {
                {
                 Object c__4343__auto__22 = ((IFn)const__32.getRawRoot()).invoke(seq_501021);
                 java.lang.Object seq_501015___aux = ((IFn)const__33.getRawRoot()).invoke(seq_501021);
                 java.lang.Object chunk_501116___aux = c__4343__auto__22;
                 long count_501217___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__22)));
                 long i_501318___aux = clojure.lang.RT.intCast((long)0L);
                 seq_501015 = seq_501015___aux;
                 chunk_501116 = chunk_501116___aux;
                 count_501217 = count_501217___aux;
                 i_501318 = i_501318___aux;
                 continue;
                }
               } else {
                {
                 Object arg23 = ((IFn)const__36.getRawRoot()).invoke(seq_501021);
                 ((IFn)const__16.getRawRoot()).invoke(const__24.getRawRoot(), prefix13, ((IFn)const__25.getRawRoot()).invoke(arg23, opts3));
                 java.lang.Object seq_501015___aux = ((IFn)const__37.getRawRoot()).invoke(seq_501021);
                 java.lang.Object chunk_501116___aux = null;
                 long count_501217___aux = 0L;
                 long i_501318___aux = 0L;
                 seq_501015 = seq_501015___aux;
                 chunk_501116 = chunk_501116___aux;
                 count_501217 = count_501217___aux;
                 i_501318 = i_501318___aux;
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
        }
       }
       long i_500810___aux = clojure.lang.Numbers.unchecked_inc((long)i_500810);
       i_500810 = i_500810___aux;
       continue;
      }
     } else {
      {
       Object temp__4117__auto__24 = ((IFn)const__13.getRawRoot()).invoke(seq_50057);
       Object __r3207 = temp__4117__auto__24;
       if (__r3207 != null && !(__r3207 == Boolean.FALSE)) {
        {
         Object seq_500525 = temp__4117__auto__24;
         Object __r3209 = ((IFn)const__31.getRawRoot()).invoke(seq_500525);
         if (__r3209 != null && !(__r3209 == Boolean.FALSE)) {
          {
           Object c__4343__auto__26 = ((IFn)const__32.getRawRoot()).invoke(seq_500525);
           java.lang.Object seq_50057___aux = ((IFn)const__33.getRawRoot()).invoke(seq_500525);
           java.lang.Object chunk_50068___aux = c__4343__auto__26;
           long count_50079___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__26)));
           long i_500810___aux = clojure.lang.RT.intCast((long)0L);
           seq_50057 = seq_50057___aux;
           chunk_50068 = chunk_50068___aux;
           count_50079 = count_50079___aux;
           i_500810 = i_500810___aux;
           continue;
          }
         } else {
          {
           Object arg27 = ((IFn)const__36.getRawRoot()).invoke(seq_500525);
           Object __r3211 = ((IFn)const__23.getRawRoot()).invoke(arg27);
           if (__r3211 != null && !(__r3211 == Boolean.FALSE)) {
            ((IFn)const__16.getRawRoot()).invoke(const__24.getRawRoot(), null, ((IFn)const__25.getRawRoot()).invoke(arg27, opts3));
           } else {
            {
             Object vec__501428 = arg27;
             Object prefix29 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__501428), (int)RT.intCast(0L), ((java.lang.Object)null)));
             Object args30 = ((IFn)const__27.getRawRoot()).invoke(vec__501428, const__28);
             ((IFn)const__15.getRawRoot()).invoke((clojure.lang.Util.identical(((java.lang.Object)prefix29), ((java.lang.Object)null)) ? Boolean.TRUE : Boolean.FALSE), "prefix cannot be nil");
             {
              Object seq_501531 = ((IFn)const__13.getRawRoot()).invoke(args30);
              Object chunk_501632 = null;
              long count_501733 = 0L;
              long i_501834 = 0L;
              while(true) {
               if (clojure.lang.Numbers.lt((long)i_501834, (long)count_501733)) {
                {
                 Object arg35 = ((java.lang.Object)((clojure.lang.Indexed)chunk_501632).nth((int)RT.intCast(i_501834)));
                 ((IFn)const__16.getRawRoot()).invoke(const__24.getRawRoot(), prefix29, ((IFn)const__25.getRawRoot()).invoke(arg35, opts3));
                 long i_501834___aux = clojure.lang.Numbers.unchecked_inc((long)i_501834);
                 i_501834 = i_501834___aux;
                 continue;
                }
               } else {
                {
                 Object temp__4117__auto__36 = ((IFn)const__13.getRawRoot()).invoke(seq_501531);
                 Object __r3214 = temp__4117__auto__36;
                 if (__r3214 != null && !(__r3214 == Boolean.FALSE)) {
                  {
                   Object seq_501537 = temp__4117__auto__36;
                   Object __r3216 = ((IFn)const__31.getRawRoot()).invoke(seq_501537);
                   if (__r3216 != null && !(__r3216 == Boolean.FALSE)) {
                    {
                     Object c__4343__auto__38 = ((IFn)const__32.getRawRoot()).invoke(seq_501537);
                     java.lang.Object seq_501531___aux = ((IFn)const__33.getRawRoot()).invoke(seq_501537);
                     java.lang.Object chunk_501632___aux = c__4343__auto__38;
                     long count_501733___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__38)));
                     long i_501834___aux = clojure.lang.RT.intCast((long)0L);
                     seq_501531 = seq_501531___aux;
                     chunk_501632 = chunk_501632___aux;
                     count_501733 = count_501733___aux;
                     i_501834 = i_501834___aux;
                     continue;
                    }
                   } else {
                    {
                     Object arg39 = ((IFn)const__36.getRawRoot()).invoke(seq_501537);
                     ((IFn)const__16.getRawRoot()).invoke(const__24.getRawRoot(), prefix29, ((IFn)const__25.getRawRoot()).invoke(arg39, opts3));
                     java.lang.Object seq_501531___aux = ((IFn)const__37.getRawRoot()).invoke(seq_501537);
                     java.lang.Object chunk_501632___aux = null;
                     long count_501733___aux = 0L;
                     long i_501834___aux = 0L;
                     seq_501531 = seq_501531___aux;
                     chunk_501632 = chunk_501632___aux;
                     count_501733 = count_501733___aux;
                     i_501834 = i_501834___aux;
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
            }
           }
           java.lang.Object seq_50057___aux = ((IFn)const__37.getRawRoot()).invoke(seq_500525);
           java.lang.Object chunk_50068___aux = null;
           long count_50079___aux = 0L;
           long i_500810___aux = 0L;
           seq_50057 = seq_50057___aux;
           chunk_50068 = chunk_50068___aux;
           count_50079 = count_50079___aux;
           i_500810 = i_500810___aux;
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
 public int getRequiredArity() {
  return 0;
 }
}
