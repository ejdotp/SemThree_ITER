----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 12/23/2023 02:43:37 PM
-- Design Name: 
-- Module Name: TwoBitComparator_tb - dataflow
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity TwoBitComparator_tb is
--  Port ( );
end TwoBitComparator_tb;
--E. JAGADEESWAR PATRO-2241016309
architecture dataflow of TwoBitComparator_tb is
component TwoBitComparator
port(a, b, c, d: in std_logic;
     x, y, z: out std_logic);
end component;
signal a, b, c, d: std_logic;
signal x, y, z: std_logic;
begin
uut: TwoBitComparator port map(a=>a, b=>b, c=>c, d=>d, x=>x, y=>y, z=>z);
stimulus: process
begin
a<='0';b<='0';c<='0';d<='0'; wait for 10ns;
a<='0';b<='0';c<='0';d<='1'; wait for 10ns;
a<='0';b<='0';c<='1';d<='0'; wait for 10ns;
a<='0';b<='0';c<='1';d<='1'; wait for 10ns;
a<='0';b<='1';c<='0';d<='0'; wait for 10ns;
a<='0';b<='1';c<='0';d<='1'; wait for 10ns;
a<='0';b<='1';c<='1';d<='0'; wait for 10ns;
a<='0';b<='1';c<='1';d<='1'; wait for 10ns;
a<='1';b<='0';c<='0';d<='0'; wait for 10ns;
a<='1';b<='0';c<='0';d<='1'; wait for 10ns;
a<='1';b<='0';c<='1';d<='0'; wait for 10ns;
a<='1';b<='0';c<='1';d<='1'; wait for 10ns;
a<='1';b<='1';c<='0';d<='0'; wait for 10ns;
a<='1';b<='1';c<='0';d<='1'; wait for 10ns;
a<='1';b<='1';c<='1';d<='0'; wait for 10ns;
a<='1';b<='1';c<='1';d<='1'; wait for 10ns;
end process;
end dataflow;
